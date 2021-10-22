package com.vic.designpattern.p01SimpleFactory.demo2.parser.impl;


import com.vic.designpattern.p01SimpleFactory.demo2.parser.IRuleConfigParser;
import com.vic.designpattern.p01SimpleFactory.demo2.pojo.RuleConfig;

public class JsonRuleConfigParser implements IRuleConfigParser {

    @Override
    public RuleConfig parse(String configText) {
        return new RuleConfig("Json Rule: " + configText);
    }
}
