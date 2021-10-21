package com.vic.designpattern.p01simpleFactory.demo2.impl;


import com.vic.designpattern.p01simpleFactory.demo2.RuleConfigParser;
import com.vic.designpattern.p01simpleFactory.demo2.RuleConfig;

public class PropertiesRuleConfigParser implements RuleConfigParser {

    @Override
    public RuleConfig parse(String configText) {
        return new RuleConfig(configText);
    }
}
