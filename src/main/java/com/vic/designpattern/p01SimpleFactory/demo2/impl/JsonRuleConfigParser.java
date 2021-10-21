package com.vic.designpattern.p01SimpleFactory.demo2.impl;


import com.vic.designpattern.p01SimpleFactory.demo2.IRuleConfigParser;
import com.vic.designpattern.p01SimpleFactory.demo2.RuleConfig;

public class JsonRuleConfigParser implements IRuleConfigParser {

    @Override
    public RuleConfig parse(String configText) {
        return new RuleConfig(configText);
    }
}
