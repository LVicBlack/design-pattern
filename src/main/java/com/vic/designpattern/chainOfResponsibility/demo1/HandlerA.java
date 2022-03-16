package com.vic.designpattern.chainOfResponsibility.demo1;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class HandlerA extends Handler{
    @Override
    protected boolean doHandle() {
        boolean handle = false;
        // ...
        log.info("HandlerA doHandle ...");
        return handle;
    }
}
