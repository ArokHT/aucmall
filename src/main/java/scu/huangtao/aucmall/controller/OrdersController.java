package scu.huangtao.aucmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import scu.huangtao.aucmall.common.domain.MallOrders;
import scu.huangtao.aucmall.common.domain.OrdersView;
import scu.huangtao.aucmall.service.OrdersService;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class OrdersController {
    @Autowired
    OrdersService ordersService;
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
        System.out.println("name-->" + myBought.get(0).getName());
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
        System.out.println("name-->" + mysells.get(0).getName());
        model.addAttribute("curpage", curpage);
        model.addAttribute("totalpage", talpage);
        model.addAttribute("mySells", mysells);
        return "orders/mysells";
    }
}