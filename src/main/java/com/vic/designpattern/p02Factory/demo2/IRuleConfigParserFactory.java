package com.vic.designpattern.p02Factory.demo2;

import com.vic.designpattern.p01SimpleFactory.demo2.IRuleConfigParser;

public interface IRuleConfigParserFactory {
    IRuleConfigParser createParser();
}
