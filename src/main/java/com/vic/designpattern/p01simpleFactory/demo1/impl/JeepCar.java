package com.vic.designpattern.p01simpleFactory.demo1.impl;

import com.vic.designpattern.p01simpleFactory.demo1.ICar;


public class JeepCar implements ICar {
    @Override
    public void get() {
        System.out.println("获得越野车");
    }
}
