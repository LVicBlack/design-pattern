package com.vic.designpattern.p03AbstractFactory.demoDB.dao;


public class UserDaoMySQLImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("an user has bean inserted into mysql");
    }
}
