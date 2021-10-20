package com.vic.designpattern.simpleFactory;


public class simpleFactoryDemo {
    public static void main(String[] args) {
        Factory.HATCHBACK.getCar().get();
        Factory.JEEP.getCar().get();
        Factory.SPORT.getCar().get();
    }
}
