package com.vic.designpattern.p02Factory.demo2;

import com.vic.designpattern.p02Factory.demo2.impl.JsonRuleConfigParserFactory;
import com.vic.designpattern.p02Factory.demo2.impl.PropertiesRuleConfigParserFactory;
import com.vic.designpattern.p02Factory.demo2.impl.XmlRuleConfigParserFactory;
import com.vic.designpattern.p02Factory.demo2.impl.YamlRuleConfigParserFactory;

import java.util.HashMap;
import java.util.Map;

public class RuleConfigParserFactoryMap {
    private static final Map<String, IRuleConfigParserFactory> cachedFactories = new HashMap<>();

    static {
        cachedFactories.put("json", new JsonRuleConfigParserFactory());
        cachedFactories.put("xml", new XmlRuleConfigParserFactory());
        cachedFactories.put("yaml", new YamlRuleConfigParserFactory());
        cachedFactories.put("properties", new PropertiesRuleConfigParserFactory());
    }

    public static IRuleConfigParserFactory getParserFactory(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        return cachedFactories.get(type.toLowerCase());
    }
}
