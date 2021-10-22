package com.vic.designpattern.p01SimpleFactory.demo2.parser.impl;


import com.vic.designpattern.p01SimpleFactory.demo2.pojo.RuleConfig;
import com.vic.designpattern.p01SimpleFactory.demo2.parser.IRuleConfigParser;

public class YamlRuleConfigParser implements IRuleConfigParser {

    @Override
    public RuleConfig parse(String configText) {
        return new RuleConfig("Yaml Rule: " + configText);
    }
}
