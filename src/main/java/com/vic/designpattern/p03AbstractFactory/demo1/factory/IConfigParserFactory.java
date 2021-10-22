package com.vic.designpattern.p03AbstractFactory.demo1.factory;


import com.vic.designpattern.p01SimpleFactory.demo2.parser.IRuleConfigParser;
import com.vic.designpattern.p03AbstractFactory.demo1.parser.ISystemConfigParser;

public interface IConfigParserFactory {
    IRuleConfigParser createRuleParser();

    ISystemConfigParser createSystemParser();

    //此处可以扩展新的parser类型，比如IBizConfigParser
}
