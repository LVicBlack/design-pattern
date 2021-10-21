package com.vic.designpattern.p02Factory.demo2.impl;


import com.vic.designpattern.p01SimpleFactory.demo2.IRuleConfigParser;
import com.vic.designpattern.p01SimpleFactory.demo2.impl.JsonRuleConfigParser;
import com.vic.designpattern.p02Factory.demo2.IRuleConfigParserFactory;

public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }
}
