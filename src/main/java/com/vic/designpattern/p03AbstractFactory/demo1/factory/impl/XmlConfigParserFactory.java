package com.vic.designpattern.p03AbstractFactory.demo1.factory.impl;


import com.vic.designpattern.p01SimpleFactory.demo2.parser.IRuleConfigParser;
import com.vic.designpattern.p01SimpleFactory.demo2.parser.impl.XmlRuleConfigParser;
import com.vic.designpattern.p03AbstractFactory.demo1.factory.IConfigParserFactory;
import com.vic.designpattern.p03AbstractFactory.demo1.parser.ISystemConfigParser;
import com.vic.designpattern.p03AbstractFactory.demo1.parser.impl.XmlSystemConfigParser;

public class XmlConfigParserFactory implements IConfigParserFactory {
    @Override
    public IRuleConfigParser createRuleParser() {
        return new XmlRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new XmlSystemConfigParser();
    }
}
