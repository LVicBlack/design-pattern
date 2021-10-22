package com.vic.designpattern.p02Factory.demoDB.factory;

import com.vic.designpattern.p02Factory.demoDB.dao.UserDao;
import com.vic.designpattern.p02Factory.demoDB.dao.UserDaoOracleImpl;

public class UserDaoOracleFactory implements UserDaoFactory {
    @Override
    public UserDao createUserDao() {
        return new UserDaoOracleImpl();
    }
}
