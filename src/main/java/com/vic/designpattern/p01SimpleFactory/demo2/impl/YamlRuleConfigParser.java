package com.vic.designpattern.p01SimpleFactory.demo2.impl;


import com.vic.designpattern.p01SimpleFactory.demo2.RuleConfig;
import com.vic.designpattern.p01SimpleFactory.demo2.IRuleConfigParser;

public class YamlRuleConfigParser implements IRuleConfigParser {

    @Override
    public RuleConfig parse(String configText) {
        return new RuleConfig(configText);
    }
}
