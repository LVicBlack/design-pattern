package com.vic.designpattern.p03AbstractFactory.demoDB.planA;

import com.vic.designpattern.p03AbstractFactory.demoDB.planA.factory.DaoFactory;
import com.vic.designpattern.p03AbstractFactory.demoDB.planA.factory.DaoMySQLFactory;
import com.vic.designpattern.p03AbstractFactory.demoDB.planA.factory.DaoOracleFactory;

public class Main {

    public static void main(String[] args) {
        System.out.println("==== if mysql ====");
        DaoFactory factory1 = new DaoMySQLFactory();
        factory1.createUserDao().add();
        factory1.createLogDao().add();

        System.out.println("==== if oracle ====");
        DaoFactory factory2 = new DaoOracleFactory();
        factory2.createUserDao().add();
        factory2.createLogDao().add();
    }

}
