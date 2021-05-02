package scu.huangtao.aucmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import scu.huangtao.aucmall.common.domain.Account;
import scu.huangtao.aucmall.common.domain.ShippingAddress;
import scu.huangtao.aucmall.common.domain.User;
import scu.huangtao.aucmall.service.AccountService;
import scu.huangtao.aucmall.service.ShippingAddressService;
import scu.huangtao.aucmall.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    ShippingAddressService shippingAddressService;
    @Autowired
    AccountService accountService;
    @RequestMapping(value ="mall/login")
    @ResponseBody
    public String login(@RequestParam("loginName") String loginName,
                        @RequestParam("password") String password,
                        HttpSession session, HttpServletResponse response, HttpServletRequest request){

        if (StringUtils.isEmpty(loginName) || StringUtils.isEmpty(password)) {
            session.setAttribute("errorMsg", "用户名或密码不能为空");
            return "admin/login";
        }
        JSONObject jsonObject = new JSONObject();
        User userDB = userService.login(loginName);
        System.out.println(loginName + password);
        System.out.println(userDB.getMail());
        String msg = "";
        String type = "";

        if(userDB==null){
            type="0";
            msg="用户名不存在或错误！";
        }else {
            if (userDB.getPassword().equals(password)) {
                type="1";
                msg="登录成功！即将跳转至首页！";
                session.setAttribute("User", userDB);
                session.setAttribute("UserId", userDB.getId());
            }else {
                type="2";
                msg="密码错误!";
            }
        }
        jsonObject.put("message", msg);
        jsonObject.put("type", type);
        System.out.println(jsonObject.toString());
        return jsonObject.toString();
    }

    @RequestMapping(value ="mall/register")
    @ResponseBody
    public String register(@RequestParam("loginName") String loginName,
                           @RequestParam("password") String password,
                           @RequestParam("nickName") String nickName,
                           @RequestParam("sex") String sex,
                           HttpSession session, HttpServletResponse response, HttpServletRequest request){

        System.out.println(loginName + "-->" + password);
        JSONObject jsonObject = new JSONObject();
        User userDB = userService.login(loginName);
        String msg = "";
        String type = "";

        if(userDB!=null){
            type="0";
            msg="用户名已经存在！";
        }else {
            int insert=userService.register(nickName,loginName,password,sex);
            if(insert==0){
                type="1";
                msg="注册失败,请重新尝试注册！";
            }else {
                type="2";
                msg="注册成功！请登录！";
            }
        }
        jsonObject.put("message", msg);
        jsonObject.put("type", type);
        System.out.println(jsonObject.toString());
        return jsonObject.toString();
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().removeAttribute("User");
        request.getSession().removeAttribute("UserId");
        return "mall/login";
    }
    @RequestMapping("/personal")
    public String personal(HttpServletRequest request, HttpSession session, Model model) {
        if(request.getSession().getAttribute("UserId") == null){
            return "mall/login";
        }
        int userid = (int) session.getAttribute("UserId");
        Account account = accountService.getOneAccountById(userid);
        if(account == null){
            account = new Account();
            account.setEtheraddress("");
        }
        System.out.println("got id == " + userid + "'s account, and value: " + account.getEtheraddress());
        session.setAttribute("Account", account);
        return "mall/personal";
    }

    @RequestMapping("/addAddress")
    @ResponseBody
    public String addAddress(@RequestParam("address") String address, HttpSession session){

        int userid=(int) session.getAttribute("UserId");
        String msg = "";
        String type = "";
        JSONObject jsonObject = new JSONObject();
        int insert=shippingAddressService.addAddress(userid, address);
        if(insert==0){
            type="1";
            msg="添加失败！";
        }else {
            type="2";
            msg="添加成功！";
        }
        jsonObject.put("message", msg);
        jsonObject.put("type", type);
        System.out.println(jsonObject.toString());
        return jsonObject.toString();
    }
    @GetMapping("/address")
    public String address(HttpSession session, Model model){
        int userid=(int) session.getAttribute("UserId");
        List<ShippingAddress> shippingAddresses = shippingAddressService.getAddress(userid);
        System.out.println("找到了" + shippingAddresses.size() + "条地址");
        model.addAttribute("addresses", shippingAddresses);
        return "mall/address";
    }
    @RequestMapping("/setDefault")
    @ResponseBody
    public String setDefault(@RequestParam("beforeId") String beforeId, @RequestParam("afterId") String afterId, HttpSession session){
        System.out.println("beforeId:" + beforeId);
        System.out.println("afterId:" + afterId);
        String msg = "";
        String type = "";
        int insert;
        if(beforeId == ""){
            System.out.println("kkkkk");
            insert = shippingAddressService.setDefault(Integer.parseInt(afterId));
            if(insert==0){
                type="1";
                msg="添加失败！";
            }else {
                type="2";
                msg="添加成功！";
            }
        }else {
            insert = shippingAddressService.setDefault(Integer.parseInt(beforeId),Integer.parseInt(afterId));
            if(insert==0){
                type="1";
                msg="添加失败！";
            }else {
                type="2";
                msg="添加成功！";
            }
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("message", msg);
        jsonObject.put("type", type);
        return jsonObject.toString();
    }

    @RequestMapping("/deleteAddress")
    public String deleteAddress(@RequestParam("id") String id){
        shippingAddressService.deleteAddress(Integer.parseInt(id));
        System.out.println("删除" + id + "ing");
        return "mall/address";
    }
    @PostMapping("/addEtherAddr")
    @ResponseBody
    public String addEtherAddr(@RequestParam("etherAddress") String etherAddress, HttpSession session){
        int userid=(int) session.getAttribute("UserId");
        JSONObject jsonObject = new JSONObject();
        Account acc = new Account();
        String msg = "";
        String type = "";
        acc.setId(userid);
        acc.setEtheraddress(etherAddress);
        int insert = accountService.insert(acc);
        if(insert==0){
            type="1";
            msg="添加失败！";
        }else {
            type="2";
            msg="添加成功！";
        }
        jsonObject.put("message", msg);
        jsonObject.put("type", type);
        System.out.println(jsonObject.toString());
        return jsonObject.toString();
    }


}
