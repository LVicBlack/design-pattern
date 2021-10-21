package com.vic.designpattern.p01SimpleFactory.demo1.impl;

import com.vic.designpattern.p01SimpleFactory.demo1.ICar;

public class SportCar implements ICar {
    @Override
    public void get() {
        System.out.println("获得跑车");
    }
}
