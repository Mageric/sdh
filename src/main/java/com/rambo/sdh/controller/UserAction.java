package com.rambo.sdh.controller;

import com.rambo.sdh.pojo.User;
import com.rambo.sdh.service.inter.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Create by Yet on 2016/8/3
 **/
@Controller
@RequestMapping("/user")
public class UserAction {
    @Autowired
    UserService userService;

    @RequestMapping("/add")
    public String addUser(User user) {
        user.setCreateDate(new Date());
        user.setModifyDate(new Date());
        userService.addUser(user);
        return "index";
    }
}