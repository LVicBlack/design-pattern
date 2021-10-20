package com.vic.designpattern.p02Factory.impl;

import com.vic.designpattern.p01simpleFactory.demo1.ICar;
import com.vic.designpattern.p02Factory.IFactory;


public class JeepFactory implements IFactory {
    @Override
    public ICar CreateCar() {
        return new JeepCar();
    }
}
