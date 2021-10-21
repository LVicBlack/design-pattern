package com.vic.designpattern.exception;


public class DefaultException extends RuntimeException {

    protected String status;

    private Object data;

    public String status() {
        return status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public DefaultException(String message) {
        super(message);
    }

    public DefaultException(String status, String message) {
        super(message);
        this.status = status;
    }

    public DefaultException(String message, Object data) {
        super(message);
        this.data = data;
    }

    public DefaultException(String status, String message, Object data) {
        super(message);
        this.status = status;
        this.data = data;
    }
}
