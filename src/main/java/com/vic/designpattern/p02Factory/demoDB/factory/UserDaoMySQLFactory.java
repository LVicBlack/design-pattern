package com.vic.designpattern.p02Factory.demoDB.factory;

import com.vic.designpattern.p02Factory.demoDB.dao.UserDao;
import com.vic.designpattern.p02Factory.demoDB.dao.UserDaoMySQLImpl;

public class UserDaoMySQLFactory implements UserDaoFactory{
    @Override
    public UserDao createUserDao() {
        return new UserDaoMySQLImpl();
    }
}
