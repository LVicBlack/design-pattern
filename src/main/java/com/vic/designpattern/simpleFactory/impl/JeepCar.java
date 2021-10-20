package com.vic.designpattern.simpleFactory.impl;

import com.vic.designpattern.simpleFactory.ICar;


public class JeepCar implements ICar {
    @Override
    public void get() {
        System.out.println("获得越野车");
    }
}
