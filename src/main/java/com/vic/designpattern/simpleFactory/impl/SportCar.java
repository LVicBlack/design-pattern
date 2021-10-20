package com.vic.designpattern.simpleFactory.impl;

import com.vic.designpattern.simpleFactory.ICar;

public class SportCar implements ICar {
    @Override
    public void get() {
        System.out.println("获得跑车");
    }
}
