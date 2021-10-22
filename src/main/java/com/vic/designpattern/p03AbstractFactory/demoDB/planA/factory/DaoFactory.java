package com.vic.designpattern.p03AbstractFactory.demoDB.planA.factory;

import com.vic.designpattern.p03AbstractFactory.demoDB.dao.LogDao;
import com.vic.designpattern.p03AbstractFactory.demoDB.dao.UserDao;

public interface DaoFactory {
    UserDao createUserDao();
    LogDao createLogDao();
}
