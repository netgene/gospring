package com.gavin.controller;

/**
 * Created by Administrator on 2018/3/13.
 */
import com.gavin.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;

import com.gavin.model.User;
import com.gavin.dao.UserDAO;
import com.gavin.service.UserService;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
import java.util.HashMap;

@Controller
public class LoginController {
    @Autowired
    private UserService userService = new UserServiceImpl();

    //登陆界面
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String TestString(){
        return "login";
    }

    //登陆处理
    @RequestMapping(value = "/dologin", method = RequestMethod.POST)
    public ModelAndView DoLogin(HttpServletRequest request){
        //获取页面参数
        String loginid=request.getParameter("loginid");
        String password=request.getParameter("password");
        System.out.println("loginid:" + loginid + " password:" + password);

        //绑定查询参数
        User paramUser = new User();
        paramUser.setLoginid(loginid);
        paramUser.setPassword(password);
        User user = userService.getUser(paramUser);

        //用户校验返回页面逻辑
        ModelAndView mav = null;
        if (user != null) {
            System.out.println("loginid:" + loginid + " user.loginid:" + user.getLoginid());
            mav = new ModelAndView("home");
            mav.addObject("username", user.getUserName());
        } else {
            mav = new ModelAndView("login");
            mav.addObject("message", "账号或密码错误");
        }
        return mav;
    }
}
