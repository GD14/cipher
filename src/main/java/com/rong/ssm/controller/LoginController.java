package com.rong.ssm.controller;

import com.rong.ssm.pojo.User;
import com.rong.ssm.service.LoginService;
import com.rong.ssm.util.MD5Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by wh on 2017/8/29.
 */
@Controller
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping("/login")
    public ModelAndView loginValidation(Model model,User user) throws Exception{
        String pwd=MD5Tools.MD5(user.getPassword());
        user.setPassword(pwd);
        User userInfo=loginService.checkUser(user);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("userinfo",userInfo);
        modelAndView.setViewName("success");
         return modelAndView;
    }

    @RequestMapping("/logOut")
    public String loginOut(HttpSession httpSession){
        httpSession.invalidate();
        return "login";
    }
}
