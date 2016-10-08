package com.rambo.sdh.dao.impl;

import com.rambo.sdh.dao.inter.UserDao;
import com.rambo.sdh.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User, String> implements UserDao {


    public User findUserByUuid(String uuid) {
        return get(uuid);
    }

    public User addUser(User user) {
        return super.save(user);
    }
}
