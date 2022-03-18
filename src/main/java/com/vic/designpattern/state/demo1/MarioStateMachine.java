package com.vic.designpattern.state.demo1;

import cn.hutool.core.util.RandomUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

import static com.vic.designpattern.state.demo1.State.*;

/**
 * 状态机
 */
@Slf4j
public class MarioStateMachine {

    private int score;
    private State state;

    private static final State[][] stateTable = {
            {SUPER, CAPE, FIRE, DEAD},
            {SUPER, CAPE, FIRE, SMALL},
            {FIRE, FIRE, FIRE, SMALL},
            {CAPE, CAPE, CAPE, SMALL}
    };

    private static final int[][] scoreTable = {
            {100, 200, 300, 0},
            {0, 200, 300, -100},
            {0, 0, 0, -200},
            {0, 0, 0, -300}
    };

    public MarioStateMachine() {
        this.score = 0;
        this.state = SMALL;
    }

    public void randomEvent() {
        int index = RandomUtil.randomInt(4);
        executeEvent(Optional.ofNullable(Event.getByValue(index)).orElse(Event.MET_MONSTER));
    }

    public void obtainMushRoom() {
        executeEvent(Event.GOT_MUSHROOM);
    }

    public void obtainCape() {
        executeEvent(Event.GOT_CAPE);
    }

    public void obtainFireFlower() {
        executeEvent(Event.GOT_FIRE);
    }

    public void meetMonster() {
        executeEvent(Event.MET_MONSTER);
    }

    private void executeEvent(Event event) {
        int oriState = this.state.v();
        String oriStateDesc = this.state.desc();
        int eventValue = event.v();
        String eventDesc = event.desc();
        this.state = stateTable[oriState][eventValue];
        this.score += scoreTable[oriState][eventValue];
        log.info("当前状态: {}, 事件: {}, 状态更改为: {} , 当前分数: {}", oriStateDesc, eventDesc, state.desc(), score);
    }

    public int getScore() {
        return score;
    }

    public State getState() {
        return state;
    }
}
