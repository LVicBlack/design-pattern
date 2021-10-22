package com.vic.designpattern.p03AbstractFactory.demo1.factory.impl;


import com.vic.designpattern.p01SimpleFactory.demo2.parser.IRuleConfigParser;
import com.vic.designpattern.p01SimpleFactory.demo2.parser.impl.JsonRuleConfigParser;
import com.vic.designpattern.p03AbstractFactory.demo1.factory.IConfigParserFactory;
import com.vic.designpattern.p03AbstractFactory.demo1.parser.ISystemConfigParser;
import com.vic.designpattern.p03AbstractFactory.demo1.parser.impl.JsonSystemConfigParser;

public class JsonConfigParserFactory implements IConfigParserFactory {
    @Override
    public IRuleConfigParser createRuleParser() {
        return new JsonRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new JsonSystemConfigParser();
    }
}
