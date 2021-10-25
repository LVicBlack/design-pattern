package com.vic.designpattern.p03AbstractFactory.demoDB.planB;

public class Main {

    public static void main(String[] args) {
        System.out.println("==== if mysql ====");
        String DB1 = "mysql";
        DataAccess mysqlDataAccess = new DataAccess(DB1);
        mysqlDataAccess.createUserDao().add();
        mysqlDataAccess.createLogDao().add();

        System.out.println("==== if oracle ====");
        String DB2 = "oracle";
        DataAccess oracleDataAccess = new DataAccess(DB2);
        oracleDataAccess.createUserDao().add();
        oracleDataAccess.createLogDao().add();
    }

}
