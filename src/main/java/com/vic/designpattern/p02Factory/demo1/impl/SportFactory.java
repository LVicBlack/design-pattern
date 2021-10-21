package com.vic.designpattern.p02Factory.demo1.impl;

import com.vic.designpattern.p01SimpleFactory.demo1.ICar;
import com.vic.designpattern.p02Factory.demo1.IFactory;


public class SportFactory implements IFactory {
    @Override
    public ICar CreateCar() {
        return new SportCar();
    }
}
