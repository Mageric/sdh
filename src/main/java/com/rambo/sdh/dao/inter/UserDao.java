package com.rambo.sdh.dao.inter;

import com.rambo.sdh.pojo.User;

public interface UserDao extends BaseDao<User, String> {

    /**
     * Description:通过 uuid 获取用户PO
     */
    User findUserByUuid(String uuid);

    /**
      *Description:添加用户
      */
    User addUser(User user);
}