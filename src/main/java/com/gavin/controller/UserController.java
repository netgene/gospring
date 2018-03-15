package com.gavin.controller;

/**
 * Created by Administrator on 2017/6/12.
 */
import com.gavin.model.User;
import com.gavin.dao.UserDAO;
import com.gavin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUserAll", method = RequestMethod.GET)
    public String getAllUser(Model model){
        List<User> findAll = userService.findAll();
        model.addAttribute("userList", findAll);
        model.addAttribute("listSize", findAll.size());
        return "showUserAll";
    }
}
