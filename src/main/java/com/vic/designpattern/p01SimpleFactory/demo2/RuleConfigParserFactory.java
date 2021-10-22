package com.vic.designpattern.p01SimpleFactory.demo2;

import com.vic.designpattern.p01SimpleFactory.demo2.parser.IRuleConfigParser;
import com.vic.designpattern.p01SimpleFactory.demo2.parser.impl.JsonRuleConfigParser;
import com.vic.designpattern.p01SimpleFactory.demo2.parser.impl.XmlRuleConfigParser;
import com.vic.designpattern.p01SimpleFactory.demo2.parser.impl.YamlRuleConfigParser;
import com.vic.designpattern.p01SimpleFactory.demo2.parser.impl.PropertiesRuleConfigParser;

import java.util.HashMap;
import java.util.Map;

public class RuleConfigParserFactory {

    private static final Map<String, IRuleConfigParser> cachedParsers = new HashMap<>();

    static {
        cachedParsers.put("json", new JsonRuleConfigParser());
        cachedParsers.put("xml", new XmlRuleConfigParser());
        cachedParsers.put("yaml", new YamlRuleConfigParser());
        cachedParsers.put("properties", new PropertiesRuleConfigParser());
    }

    public static IRuleConfigParser createParser(String configFormat) {
        if (configFormat == null || configFormat.isEmpty()) {
            // 返回null或者抛出IllegalArgumentException
            return null;
        }
        return cachedParsers.get(configFormat.toLowerCase());
    }
}
