package com.vic.designpattern.p02Factory.demo2.factory;

import com.vic.designpattern.p01SimpleFactory.demo2.parser.IRuleConfigParser;

public interface IRuleConfigParserFactory {
    IRuleConfigParser createParser();
}
