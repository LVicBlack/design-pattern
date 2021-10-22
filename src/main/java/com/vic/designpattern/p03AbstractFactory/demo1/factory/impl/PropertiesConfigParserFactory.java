package com.vic.designpattern.p03AbstractFactory.demo1.factory.impl;


import com.vic.designpattern.p01SimpleFactory.demo2.parser.IRuleConfigParser;
import com.vic.designpattern.p01SimpleFactory.demo2.parser.impl.PropertiesRuleConfigParser;
import com.vic.designpattern.p03AbstractFactory.demo1.factory.IConfigParserFactory;
import com.vic.designpattern.p03AbstractFactory.demo1.parser.ISystemConfigParser;
import com.vic.designpattern.p03AbstractFactory.demo1.parser.impl.PropertiesSystemConfigParser;

public class PropertiesConfigParserFactory implements IConfigParserFactory {
    @Override
    public IRuleConfigParser createRuleParser() {
        return new PropertiesRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new PropertiesSystemConfigParser();
    }
}
