package com.rambo.sdh.dao.impl;

import com.rambo.sdh.dao.inter.UserDao;
import com.rambo.sdh.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User, String> implements UserDao {


}
