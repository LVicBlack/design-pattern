package com.vic.designpattern.p03AbstractFactory.demo1.parser;


import com.vic.designpattern.p03AbstractFactory.demo1.pojo.SystemConfig;

public interface ISystemConfigParser {
    SystemConfig parse(String configText);
}
