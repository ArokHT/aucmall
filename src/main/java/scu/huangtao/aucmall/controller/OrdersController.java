package scu.huangtao.aucmall.controller;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import scu.huangtao.aucmall.common.domain.MallOrders;
import scu.huangtao.aucmall.common.domain.OrdersView;
import scu.huangtao.aucmall.common.domain.ShippingAddress;
import scu.huangtao.aucmall.service.GoodsService;
import scu.huangtao.aucmall.service.OrdersService;
import scu.huangtao.aucmall.service.ShippingAddressService;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class OrdersController {
    @Autowired
    OrdersService ordersService;
    @Autowired
    ShippingAddressService shippingAddressService;
    @Autowired
    GoodsService goodsService;
    @GetMapping(value = "/orders")
    public String orders(@RequestParam Map<String, Object> params, HttpSession session, Model model){
        int userid = (int) session.getAttribute("UserId");
        int curpage = 1, talpage = 0;
        int page;
        if(params.get("page") == null){
            page = 1;
        }else {
            page = Integer.parseInt(params.get("page").toString());
        }
        //List<MallOrders> myBought = ordersService.getOrdersByUserId(userid);
        int total = ordersService.getOrdersNum(userid);
        List<OrdersView> myBought = ordersService.getOrdersView(page, 8, userid);
        talpage = total%8 == 0 ? total/8 : total/8 +1;
        if(page > 1){
            curpage = page;
        }
        System.out.println("一共有" + total + "个我买到的订单");
        System.out.println("找到了" + myBought.size() + "个我买到的订单");
        //System.out.println("name-->" + myBought.get(0).getName());
        model.addAttribute("curpage", curpage);
        model.addAttribute("totalpage", talpage);
        model.addAttribute("myBought", myBought);
        return "orders/my_orders";
    }
    @GetMapping(value = "/mysells")
    public String mysells(@RequestParam Map<String, Object> params, HttpSession session, Model model){
        int userid = (int) session.getAttribute("UserId");
        int curpage = 1, talpage = 0;
        int page;
        if(params.get("page") == null){
            page = 1;
        }else {
            page = Integer.parseInt(params.get("page").toString());
        }
        int total = ordersService.getSellOrdersNum(userid);
        List<OrdersView> mysells = ordersService.getSellOrdersView(page, 8, userid);
        talpage = total%8 == 0 ? total/8 : total/8 +1;
        if(page > 1){
            curpage = page;
        }
        System.out.println("找到了" + mysells.size() + "个我卖出的订单");
        //System.out.println("name-->" + mysells.get(0).getName());
        model.addAttribute("curpage", curpage);
        model.addAttribute("totalpage", talpage);
        model.addAttribute("mySells", mysells);
        return "orders/mysells";
    }
    @PostMapping(value = "/addMallOrder")
    @ResponseBody
    public String addMallOrder(@RequestBody Map<String, Object> params){
        int merchId = Integer.parseInt(params.get("merchId").toString());
        int userId = Integer.parseInt(params.get("ownerId").toString());
        int buyerId = Integer.parseInt(params.get("buyerId").toString());
        int dealPrice = Integer.parseInt(params.get("dealPrice").toString());
        ShippingAddress address=shippingAddressService.getDefaultById(buyerId);
        int m=ordersService.addMallOrder(merchId,userId,buyerId,dealPrice,address.getAddress());
        goodsService.setMerchOffshelf(merchId);//下架拍品
        JSONObject jsonObject = new JSONObject();
        String msg = "";
        String type = "";
        if(m==1){
            type = "0";
            msg = "拍卖成功";
        }else {
            type = "1";
            msg = "拍卖失败";
        }
        jsonObject.put("message", msg);
        jsonObject.put("type", type);
        System.out.println(jsonObject.toString());
        return jsonObject.toString();
    }
    @PostMapping(value = "/confirm")
    @ResponseBody
    public String confirm(@RequestBody Map<String, Object> params){
        int orderId = Integer.parseInt(params.get("orderId").toString());
        System.out.println("orderId---->" + orderId);
        int m=ordersService.updateByConfirm(orderId);
        JSONObject jsonObject = new JSONObject();
        String msg = "";
        String type = "";
        if(m==1){
            type = "0";
            msg = "收货成功";
        }else {
            type = "1";
            msg = "收货失败";
        }
        jsonObject.put("message", msg);
        jsonObject.put("type", type);
        System.out.println(jsonObject.toString());
        return jsonObject.toString();
    }
}
