package com.vic.designpattern.state.demo1;


public class Main {

    public static void main(String[] args) {
        MarioStateMachine machine = new MarioStateMachine();
//        machine.meetMonster();
        while (!State.DEAD.equals(machine.getState())){
            machine.randomEvent();
        }
    }
}
