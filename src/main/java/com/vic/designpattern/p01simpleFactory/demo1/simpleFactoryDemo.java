package com.vic.designpattern.p01simpleFactory.demo1;

import org.junit.Test;

/**
 * 简单工厂模式
 * <ul>
 * <li>特点</li>
 * <li>工厂类包含必要的逻辑判断来选择生产具体产品</li>
 * <li>用于生产单个产品</li>
 * <li>优点</li>
 * <li>去除客户端与具体产品的依赖</li>
 * <li>缺点</li>
 * <li>添加产品需要修改工厂类，违背开闭原则</li>
 * </ul>
 */
public class simpleFactoryDemo {
    @Test
    public void enumFactory(){
        EnumFactory.HATCHBACK.getCar().get();
        EnumFactory.JEEP.getCar().get();
        EnumFactory.SPORT.getCar().get();
    }

    @Test
    public void factory(){
        Factory.createCar("HATCHBACK").get();
        Factory.createCar("JEEP").get();
        Factory.createCar("SPORT").get();
    }
}
