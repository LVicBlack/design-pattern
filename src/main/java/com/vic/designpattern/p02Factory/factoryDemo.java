package com.vic.designpattern.p02Factory;

import com.vic.designpattern.p01simpleFactory.demo1.EnumFactory;

/**
 * 工厂模式
 * - 特点
 * 用于生产一系列产品
 *
 * - 优点
 * 易于改变工厂生产行为，产生新的产品系列
 * 具体创建过程与客户端分离，客户端通过接口操纵实例（factory1.createUserDAO().add()）
 *
 * - 缺点
 * 添加新产品，要修改抽象工厂接口、具体工厂，改动太多
 *
 *
 */
public class factoryDemo {
    public static void main(String[] args) {
        EnumFactory.HATCHBACK.getCar().get();
        EnumFactory.JEEP.getCar().get();
        EnumFactory.SPORT.getCar().get();
    }
}
