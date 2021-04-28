package scu.huangtao.aucmall.controller;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import scu.huangtao.aucmall.common.domain.Account;
import scu.huangtao.aucmall.common.domain.Merchandise;
import scu.huangtao.aucmall.service.AccountService;
import scu.huangtao.aucmall.service.GoodsService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class GoodsController {


    @Autowired
    private GoodsService goodsService;
    @Autowired
    private AccountService accountService;
    
    @RequestMapping(value="/addgoods.do",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String addgood(HttpSession session, HttpServletRequest request, HttpServletResponse response, @RequestBody Map<String, String> map){
        JSONObject jsonObject = new JSONObject();
        Merchandise m=new Merchandise();
        Date starttime=null;
        Date stoptime=null;
        int startprice=0;
        int addprice=0;
        int highestprice=0;
        int userid=(int) session.getAttribute("UserId");
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str1=map.get("starttime");
        String str2=map.get("stoptime");
        String flag=map.get("openAuction");
        String flag1=map.get("havehighestprice");
        String flag2=map.get("onsale");
        String img="/imgs/"+map.get("image");
        String mark=map.get("mark");
        System.out.println("img:"+img);
        if(flag.equals("yes") && flag1.equals("no") && flag2.equals("no")){//明拍无最高价不特卖
            startprice=Integer.parseInt(map.get("startprice"));
            addprice=Integer.parseInt(map.get("addprice"));
            //userid=Integer.parseInt(map.get("userid"));
            m.setReservePrice(startprice);
            m.setLeastEachPriceIncrease(addprice);
            m.setKind(map.get("kind"));
            m.setDescription( map.get("discription"));
            m.setUserId(userid);
            m.setName(map.get("name"));
        }
        if(flag.equals("yes") && flag1.equals("yes") && flag2.equals("no")){//明拍有最高价不特卖
            startprice=Integer.parseInt((String) map.get("startprice"));
            addprice=Integer.parseInt((String)map.get("addprice"));
            highestprice=Integer.parseInt((String)map.get("highestprice"));
            //userid=Integer.parseInt((String)map.get("userid"));
            m.setReservePrice(startprice);
            m.setLeastEachPriceIncrease(addprice);
            m.setHighestPrice(highestprice);
            m.setHaveHighestPrice(true);
            m.setKind((String)map.get("kind"));
            m.setDescription((String) map.get("discription"));
            m.setUserId(userid);
            m.setName((String)map.get("name"));
        }
        if(flag.equals("no")){//暗拍
            //userid=Integer.parseInt((String)map.get("userid"));
            startprice=Integer.parseInt((String) map.get("startprice"));
            m.setOpenAuction(false);
            m.setReservePrice(startprice);
            m.setKind((String)map.get("kind"));
            m.setDescription((String) map.get("discription"));
            m.setUserId(userid);
            m.setName((String)map.get("name"));
        }
        if(flag2.equals("yes") && flag.equals("yes")){//特卖
            //userid=Integer.parseInt((String)map.get("userid"));
            startprice=Integer.parseInt((String) map.get("startprice"));
            m.setOnSale(true);
            m.setReservePrice(startprice);
            m.setKind((String)map.get("kind"));
            m.setDescription((String) map.get("discription"));
            m.setUserId(userid);
            m.setName((String)map.get("name"));
        }
        try {
            starttime= format1.parse(str1);
            stoptime= format2.parse(str2);
        } catch (ParseException e) {

        }
        m.setStartTime(starttime);
        m.setStopTime(stoptime);
        m.setImg(img);
        m.setMark(mark);
        m.setStatus("上架中");
        System.out.println(m.getImg());
        int result=goodsService.insert(m);
        try{
            if(result==1){
                jsonObject.put("message", "添加成功");
                jsonObject.put("success", true);
            }else {
                jsonObject.put("message", "添加失败！");
                jsonObject.put("success", false);
            }
        }catch(Exception ex){
            jsonObject.put("message", ex.getMessage());
            jsonObject.put("success", false);
            jsonObject.put("type", "error");
        }
        return jsonObject.toString();
    }
    @GetMapping(value = "/my_goods")
    public String mygoods(@RequestParam Map<String, Object> params, HttpSession session, HttpServletRequest request, Model model){
        int userid=(int) session.getAttribute("UserId");
        int curpage = 1, talpage = 0;
        int page;
        System.out.println("page:" + params.get("page"));
        if(params.get("page") == null){
            page = 1;
        }else {
            page = Integer.parseInt(params.get("page").toString());
        }
        List<Merchandise> mygoodsall=goodsService.getAllMerchByUserId(userid);
        List<Merchandise> mygoods = goodsService.getAllMerchByUserId1(userid, page, 10);
        talpage = mygoodsall.size()%10 == 0 ? mygoodsall.size()/10 : mygoodsall.size()/10 +1;
        if(page > 1){
            curpage = page;
        }
        System.out.println("Total: " + talpage);
        System.out.println("current: " + curpage);
        //request.setAttribute("mygoods", mygoods);
        model.addAttribute("curpage", curpage);
        model.addAttribute("totalpage", talpage);
        model.addAttribute("mygoods", mygoods);
        return "goods/my_goods";
    }
    @GetMapping("/goods/detail/{goodsId}")
    public String detailPage(@PathVariable("goodsId") String goodsId, HttpSession session, HttpServletRequest request, Model model) {
        /*if (goodsId < 1) {
            return "error/error_5xx";
        }*/
        int userid = (int) session.getAttribute("UserId");
        System.out.println("getting good=> " + goodsId);
        Merchandise goodsdetail = goodsService.getOneMerchById(Integer.parseInt(goodsId)).get(0);
        Account account = accountService.getOneAccountById(userid);
        Account accountOfOwner = accountService.getOneAccountById(goodsdetail.getUserId());
        System.out.println("Account id => " + account.getId() + " etherAddress => " + account.getEtheraddress());
        System.out.println(goodsdetail.getId());
        /*if (goods == null) {
            NewBeeMallException.fail(ServiceResultEnum.GOODS_NOT_EXIST.getResult());
        }
        if (Constants.SELL_STATUS_UP != goods.getGoodsSellStatus()) {
            NewBeeMallException.fail(ServiceResultEnum.GOODS_PUT_DOWN.getResult());
        }*/
        /*NewBeeMallGoodsDetailVO goodsDetailVO = new NewBeeMallGoodsDetailVO();
        BeanUtil.copyProperties(goods, goodsDetailVO);
        goodsDetailVO.setGoodsCarouselList(goods.getGoodsCarousel().split(","));*/
        model.addAttribute("goodsDetail", goodsdetail);
        model.addAttribute("Account", account);
        model.addAttribute("AccountOfOwner", accountOfOwner);
        return "goods/detail";
    }
    @GetMapping("/mall/index")
    public String mallindex(@RequestParam Map<String, Object> params, HttpSession session, HttpServletRequest request, Model model){
        int userid=(int) session.getAttribute("UserId");
        int curpage = 1, talpage = 0;
        int page;
        System.out.println("page:" + params.get("page"));
        if(params.get("page") == null){
            page = 1;
        }else {
            page = Integer.parseInt(params.get("page").toString());
        }
        List<Merchandise> goodsall=goodsService.getAllMerch(userid);
        List<Merchandise> goods = goodsService.getAllMerch(page, 20, userid);
        talpage = goodsall.size()%20 == 0 ? goodsall.size()/20 : goodsall.size()/20 +1;
        if(page > 1){
            curpage = page;
        }
        System.out.println("Total: " + talpage);
        System.out.println("current: " + curpage);
        //request.setAttribute("mygoods", mygoods);
        model.addAttribute("curpage", curpage);
        model.addAttribute("totalpage", talpage);
        model.addAttribute("goods", goods);
        return "mall/index";
    }
    @GetMapping("/goods/search")
    public String search(@RequestParam Map<String, Object> params, HttpSession session, Model model){
        int userid=(int) session.getAttribute("UserId");
        int curpage = 1, talpage = 0;
        int page;
        String keyword = params.get("keyword").toString();
        System.out.println("page:" + params.get("page"));
        if(params.get("page") == null){
            page = 1;
        }else {
            page = Integer.parseInt(params.get("page").toString());
        }
        String key="%"+keyword+"%";
        List<Merchandise> searchgoodsall=goodsService.getAllMerchSearch(userid, key);
        List<Merchandise> searchgoods = goodsService.getAllMerchSearch(page, 20, userid, key);
        talpage = searchgoodsall.size()%20 == 0 ? searchgoodsall.size()/20 : searchgoodsall.size()/20 +1;
        if(page > 1){
            curpage = page;
        }
        System.out.println("共找到" + searchgoodsall.size() + "条数据");
        System.out.println("传上去" + searchgoods.size() + "条数据");
        System.out.println("Total: " + talpage);
        System.out.println("current: " + curpage);
        //request.setAttribute("mygoods", mygoods);
        model.addAttribute("curpage", curpage);
        model.addAttribute("totalpage", talpage);
        model.addAttribute("goods", searchgoods);
        model.addAttribute("keyword", keyword);
        return "goods/search";

    }
    @GetMapping("/goods/searchByKind")
    public String searchByKind(@RequestParam Map<String, Object> params, HttpSession session, Model model) {
        int userid = (int) session.getAttribute("UserId");
        int curpage = 1, talpage = 0;
        int page;
        String keyword = params.get("keyword").toString();
        System.out.println("page:" + params.get("page"));
        if (params.get("page") == null) {
            page = 1;
        } else {
            page = Integer.parseInt(params.get("page").toString());
        }
        String key = "%" + keyword + "%";
        List<Merchandise> searchgoodsall = goodsService.getAllMerchSearch(userid, key);
        List<Merchandise> searchgoods = goodsService.getAllMerchSearch(page, 20, userid, key);
        talpage = searchgoodsall.size() % 20 == 0 ? searchgoodsall.size() / 20 : searchgoodsall.size() / 20 + 1;
        if (page > 1) {
            curpage = page;
        }
        System.out.println("共找到" + searchgoodsall.size() + "条数据");
        System.out.println("传上去" + searchgoods.size() + "条数据");
        System.out.println("Total: " + talpage);
        System.out.println("current: " + curpage);
        //request.setAttribute("mygoods", mygoods);
        model.addAttribute("curpage", curpage);
        model.addAttribute("totalpage", talpage);
        model.addAttribute("goods", searchgoods);
        model.addAttribute("keyword", keyword);
        return "goods/search";
    }
}
