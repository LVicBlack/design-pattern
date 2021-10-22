package com.vic.designpattern.p02Factory.demoDB;

import com.vic.designpattern.p02Factory.demoDB.dao.UserDao;
import com.vic.designpattern.p02Factory.demoDB.factory.UserDaoMySQLFactory;
import com.vic.designpattern.p02Factory.demoDB.factory.UserDaoOracleFactory;

public class Main {

    public static void main(String[] args) {
        System.out.println("==== if mysql ====");
        UserDao userDao1 = new UserDaoMySQLFactory().createUserDao();
        userDao1.add();
        System.out.println("==== if oracle ====");
        UserDao userDao2 = new UserDaoOracleFactory().createUserDao();
        userDao2.add();
    }

}
