package com.vic.designpattern.p01simpleFactory.demo2.impl;


import com.vic.designpattern.p01simpleFactory.demo2.RuleConfig;
import com.vic.designpattern.p01simpleFactory.demo2.RuleConfigParser;

public class YamlRuleConfigParser implements RuleConfigParser {

    @Override
    public RuleConfig parse(String configText) {
        return new RuleConfig(configText);
    }
}
