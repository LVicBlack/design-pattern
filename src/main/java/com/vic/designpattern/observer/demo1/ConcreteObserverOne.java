package com.vic.designpattern.observer.demo1;

public class ConcreteObserverOne implements Observer {
    @Override
    public void update(String message) {
        System.out.println("ConcreteObserverOne is notified. message: " + message);
    }
}
