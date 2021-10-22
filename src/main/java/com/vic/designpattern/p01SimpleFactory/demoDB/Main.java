package com.vic.designpattern.p01SimpleFactory.demoDB;


public class Main {
    public static void main(String[] args) {
        System.out.println("==== if mysql ====");
        UserDao userDAO1 = UserDaoFactory.createUserDao("mysql");
        userDAO1.add();
        System.out.println("==== if oracle ====");
        UserDao userDAO2 = UserDaoFactory.createUserDao("oracle");
        userDAO2.add();
    }
}
