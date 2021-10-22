package com.vic.designpattern.p03AbstractFactory.demo1.parser.impl;


import com.vic.designpattern.p03AbstractFactory.demo1.parser.ISystemConfigParser;
import com.vic.designpattern.p03AbstractFactory.demo1.pojo.SystemConfig;

public class YamlSystemConfigParser implements ISystemConfigParser {

    @Override
    public SystemConfig parse(String configText) {
        return new SystemConfig("Yaml System: " + configText);
    }
}
