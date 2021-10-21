package com.vic.designpattern.p01simpleFactory.demo2;

import com.vic.designpattern.p01simpleFactory.demo2.impl.JsonRuleConfigParser;
import com.vic.designpattern.p01simpleFactory.demo2.impl.PropertiesRuleConfigParser;
import com.vic.designpattern.p01simpleFactory.demo2.impl.XmlRuleConfigParser;
import com.vic.designpattern.p01simpleFactory.demo2.impl.YamlRuleConfigParser;

import java.util.HashMap;
import java.util.Map;

public class RuleConfigParserFactory {

    private static final Map<String, RuleConfigParser> cachedParsers = new HashMap<>();

    static {
        cachedParsers.put("json", new JsonRuleConfigParser());
        cachedParsers.put("xml", new XmlRuleConfigParser());
        cachedParsers.put("yaml", new YamlRuleConfigParser());
        cachedParsers.put("properties", new PropertiesRuleConfigParser());
    }

    public static RuleConfigParser createParser(String configFormat) {
        if (configFormat == null || configFormat.isEmpty()) {
            // 返回null或者抛出IllegalArgumentException
            return null;
        }
        return cachedParsers.get(configFormat.toLowerCase());
    }
}
