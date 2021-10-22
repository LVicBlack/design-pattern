package com.vic.designpattern.p03AbstractFactory.demoDB.planA.factory;

import com.vic.designpattern.p03AbstractFactory.demoDB.dao.LogDao;
import com.vic.designpattern.p03AbstractFactory.demoDB.dao.LogDaoOracleImpl;
import com.vic.designpattern.p03AbstractFactory.demoDB.dao.UserDao;
import com.vic.designpattern.p03AbstractFactory.demoDB.dao.UserDaoOracleImpl;

public class DaoOracleFactory implements DaoFactory {
    @Override
    public UserDao createUserDao() {
        return new UserDaoOracleImpl();
    }

    @Override
    public LogDao createLogDao() {
        return new LogDaoOracleImpl();
    }
}
