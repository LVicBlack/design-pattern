package com.vic.designpattern.ChainOfResponsibility.demo1;

/**
 * 如果它能处理该请求，就不继续往下传递；如果不能处理，则交由后面的处理器来处理
 *
 **/
public abstract class Handler {
    // next
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public final void handle() {
        boolean handled = doHandle();
        if (successor != null && !handled) {
            successor.handle();
        }
    }

    protected abstract boolean doHandle();
}
