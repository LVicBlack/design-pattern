package com.vic.designpattern.ChainOfResponsibility.demo2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HandlerB implements IHandler{
    @Override
    public boolean handle() {
        boolean handled = false;
        log.info("HandlerB doHandle ...");
        return handled;
    }
}
