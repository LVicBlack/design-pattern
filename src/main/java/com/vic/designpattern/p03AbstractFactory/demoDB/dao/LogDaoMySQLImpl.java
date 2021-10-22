package com.vic.designpattern.p03AbstractFactory.demoDB.dao;


public class LogDaoMySQLImpl implements LogDao {
    @Override
    public void add() {
        System.out.println("an log has bean inserted into mysql");
    }
}
