package scu.huangtao.aucmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CommonController {
    @RequestMapping("/")
    public String defaultindex(){
        return "mall/login";
    }
    @RequestMapping("/index")
    public String index(){
        return "mall/index";
    }
    /*@RequestMapping("mall/index")
    public String mallindex(){ return "mall/index"; }*/
    @RequestMapping("/login")
    public String logout() { return "mall/login"; }
    @RequestMapping("/register")
    public String register() { return "mall/register"; }
    /*@RequestMapping("/my_goods")
    public String mygoods(){ return "goods/my_goods"; }*/
    @RequestMapping("/add_goods")
    public String addgoods(){ return "goods/add_goods"; }

}
