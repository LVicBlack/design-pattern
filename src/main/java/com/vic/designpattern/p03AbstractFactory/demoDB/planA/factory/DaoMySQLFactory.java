package com.vic.designpattern.p03AbstractFactory.demoDB.planA.factory;

import com.vic.designpattern.p03AbstractFactory.demoDB.dao.LogDao;
import com.vic.designpattern.p03AbstractFactory.demoDB.dao.LogDaoMySQLImpl;
import com.vic.designpattern.p03AbstractFactory.demoDB.dao.UserDao;
import com.vic.designpattern.p03AbstractFactory.demoDB.dao.UserDaoMySQLImpl;

public class DaoMySQLFactory implements DaoFactory {
    @Override
    public UserDao createUserDao() {
        return new UserDaoMySQLImpl();
    }

    @Override
    public LogDao createLogDao() {
        return new LogDaoMySQLImpl();
    }
}
