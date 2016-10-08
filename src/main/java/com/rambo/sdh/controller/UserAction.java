package com.rambo.sdh.controller;

import com.rambo.sdh.pojo.User;
import com.rambo.sdh.service.inter.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create by Yet on 2016/8/3
 **/
@Controller
@RequestMapping("/user")
public class UserAction {
    private static Logger logger = Logger.getLogger(UserAction.class);
    @Autowired
    UserService userService;

    @RequestMapping("/add")
    public String addUser(User user) {
        if (user != null) {
            userService.addUser(user);
        }
        return "default";
    }
}