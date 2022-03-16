package com.vic.designpattern.chainOfResponsibility.demo2;

import com.vic.designpattern.chainOfResponsibility.demo1.Handler;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayHandlerChain {

    private List<IHandler> handlers = new ArrayList<>();

    private Handler head = null;
    private Handler tail = null;

    public void addHandler(IHandler handler) {
        this.handlers.add(handler);
    }

    public void handle() {
        for (IHandler handler : handlers) {
            boolean handled = handler.handle();
            if (handled) break;
        }
    }

    @Test
    public void test() {
        ArrayHandlerChain chain = new ArrayHandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}
