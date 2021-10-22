package com.vic.designpattern.p01SimpleFactory.demo2.parser;


import com.vic.designpattern.p01SimpleFactory.demo2.pojo.RuleConfig;

public interface IRuleConfigParser {
    RuleConfig parse(String configText);
}
