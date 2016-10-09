package com.rambo.sdh.service.impl;

import com.rambo.sdh.dao.inter.UserDao;
import com.rambo.sdh.pojo.User;
import com.rambo.sdh.service.inter.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    public User findUserByUuid(String uuid) {
        return userDao.get(uuid);
    }

    public User addUser(User user) {
        return userDao.save(user);
    }
}
