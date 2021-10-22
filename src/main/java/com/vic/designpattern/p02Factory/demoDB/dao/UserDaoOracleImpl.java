package com.vic.designpattern.p02Factory.demoDB.dao;


public class UserDaoOracleImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("an user has bean inserted into oracle");
    }
}
