package com.vic.designpattern.state.demo1;

public enum Event {
    GOT_MUSHROOM(0, "获得蘑菇"),
    GOT_CAPE(1, "获得斗篷"),
    GOT_FIRE(2, "获得火焰"),
    MET_MONSTER(3, "遇到怪兽"),
    ;

    private int value;
    private String describe;

    private Event(int value, String describe) {
        this.value = value;
        this.describe = describe;
    }

    public int v() {
        return this.value;
    }

    public String desc() {
        return describe;
    }

    public static Event getByValue(int value) {
        for (Event e : Event.values()) {
            if (e.value == value) return e;
        }
        return null;
    }
}
