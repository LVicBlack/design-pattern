package com.vic.designpattern.p02Factory.demo2.factory.impl;


import com.vic.designpattern.p01SimpleFactory.demo2.parser.IRuleConfigParser;
import com.vic.designpattern.p01SimpleFactory.demo2.parser.impl.XmlRuleConfigParser;
import com.vic.designpattern.p02Factory.demo2.factory.IRuleConfigParserFactory;

public class XmlRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new XmlRuleConfigParser();
    }
}
