package com.vic.designpattern.observer.eventBus;


import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;

import java.util.concurrent.Executors;

public class UserController {

    private EventBus eventBus;

    private static final int DEFAULT_EVENTBUS_THREAD_POOL_SIZE = 20;

    public UserController() {
        // 异步非阻塞
        eventBus = new AsyncEventBus(Executors.newFixedThreadPool(DEFAULT_EVENTBUS_THREAD_POOL_SIZE));
    }

    public void setRegObservers(){

    }
}
