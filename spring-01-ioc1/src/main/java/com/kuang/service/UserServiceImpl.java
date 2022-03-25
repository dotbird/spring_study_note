package com.kuang.service;

import com.kuang.dao.UserDao;

public class UserServiceImpl implements UserService {

    //private UserDao userDao = new UserDaoImpl();
    //private UserDao userDao = new UserDaoMysqlImpl();
    private UserDao userDao;

    //利用set进行动态实现值的注入！
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
