package com.vic.designpattern.state.demo1;

public enum State {
    SMALL(0, "原始"),
    SUPER(1, "大型"),
    FIRE(2, "火焰"),
    CAPE(3, "斗篷"),
    DEAD(4, "结束"),
    ;
    private int value;
    private String describe;

    private State(int value, String describe) {
        this.value = value;
        this.describe = describe;
    }

    public int v() {
        return this.value;
    }

    public String desc() {
        return describe;
    }
}
