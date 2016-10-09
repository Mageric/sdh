package com.rambo.sdh.controller;

import com.rambo.sdh.pojo.User;
import com.rambo.sdh.service.inter.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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
    Log log = LogFactory.getLog(UserAction.class);

    @RequestMapping("/add")
    public String addUser(User user) {

        user.setCreateDate(new Date());
        user.setModifyDate(new Date());
        for (int i = 0; i < 100; i++) {
            User user1 = userService.addUser(user);
            log.info(user1.getId());

            User user2 = userService.findUserByUuid(user1.getId());
            log.info(user2.getId());
        }
        return "index";
    }
}