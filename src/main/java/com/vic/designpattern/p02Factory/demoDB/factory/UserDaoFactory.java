package com.vic.designpattern.p02Factory.demoDB.factory;

import com.vic.designpattern.p02Factory.demoDB.dao.UserDao;

public interface UserDaoFactory {
    UserDao createUserDao();
}
