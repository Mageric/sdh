package com.rambo.sdh.controller;

import com.rambo.sdh.pojo.User;
import com.rambo.sdh.service.inter.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

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
            log.info("添加用户成功，用户 UUID:" + user1.getUuid());

            User user2 = userService.findUserByUuid(user1.getUuid());
            log.info("查找用户成功，用户 UUID:" + user2.getUuid());

            user2.setName("edit" + user2.getName());
            User user3 = userService.updateUser(user2);
            log.info("更新用户成功，用户名称：" + user3.getName());

            User user4 = userService.deleteUserById(user3.getUuid());
            log.info("删除用户成功，用户名称：" + user4.getName());
        }
        return "index";
    }
}