package com.vic.designpattern.observer.demo1;

/**
 * 观察者订阅被观察者的状态，当被观察者状态改变的时候会通知所有订阅的观察者的过程。
 */
public class Main {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.registerObserver(new ConcreteObserverOne());
        concreteSubject.registerObserver(new ConcreteObserverTwo());
        concreteSubject.notifyObserver("abc");
    }
}
