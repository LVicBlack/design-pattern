package com.vic.designpattern.simpleFactory;

import com.vic.designpattern.simpleFactory.impl.HatchbackCar;
import com.vic.designpattern.simpleFactory.impl.JeepCar;
import com.vic.designpattern.simpleFactory.impl.SportCar;


public enum Factory {
    HATCHBACK(new HatchbackCar(), "HATCHBACK"),
    JEEP(new JeepCar(), "JEEP"),
    SPORT(new SportCar(), "SPORT");

    // 成员变量
    private ICar car;
    private String name;

    // 普通方法
    public static ICar getCar(String name) {
        for (Factory c : Factory.values()) {
            if (c.name == name) {
                return c.car;
            }
        }
        return null;
    }

    // 构造方法
    private Factory(ICar car, String name) {
        this.car = car;
        this.name = name;
    }

    public ICar getCar() {
        return car;
    }

    public String getName() {
        return name;
    }
}
