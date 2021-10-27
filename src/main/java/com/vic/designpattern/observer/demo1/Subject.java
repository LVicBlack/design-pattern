package com.vic.designpattern.observer.demo1;


public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver(String message);
}
