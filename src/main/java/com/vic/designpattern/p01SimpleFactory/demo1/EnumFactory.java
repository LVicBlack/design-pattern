package com.vic.designpattern.p01SimpleFactory.demo1;

import com.vic.designpattern.p01SimpleFactory.demo1.impl.HatchbackCar;
import com.vic.designpattern.p01SimpleFactory.demo1.impl.JeepCar;
import com.vic.designpattern.p01SimpleFactory.demo1.impl.SportCar;


public enum EnumFactory {
    HATCHBACK(new HatchbackCar(), "HATCHBACK"),
    JEEP(new JeepCar(), "JEEP"),
    SPORT(new SportCar(), "SPORT");

    // 成员变量
    private ICar car;
    private String name;

    // 普通方法
    public static ICar getCar(String name) {
        for (EnumFactory c : EnumFactory.values()) {
            if (c.name == name) {
                return c.car;
            }
        }
        return null;
    }

    // 构造方法
    private EnumFactory(ICar car, String name) {
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
