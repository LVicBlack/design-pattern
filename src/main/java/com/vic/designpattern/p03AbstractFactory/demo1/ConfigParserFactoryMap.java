package com.vic.designpattern.p03AbstractFactory.demo1;

import com.vic.designpattern.p03AbstractFactory.demo1.factory.IConfigParserFactory;
import com.vic.designpattern.p03AbstractFactory.demo1.factory.impl.JsonConfigParserFactory;
import com.vic.designpattern.p03AbstractFactory.demo1.factory.impl.PropertiesConfigParserFactory;
import com.vic.designpattern.p03AbstractFactory.demo1.factory.impl.XmlConfigParserFactory;
import com.vic.designpattern.p03AbstractFactory.demo1.factory.impl.YamlConfigParserFactory;

import java.util.HashMap;
import java.util.Map;

public class ConfigParserFactoryMap {
    private static final Map<String, IConfigParserFactory> cachedFactories = new HashMap<>();

    static {
        cachedFactories.put("json", new JsonConfigParserFactory());
        cachedFactories.put("xml", new XmlConfigParserFactory());
        cachedFactories.put("yaml", new YamlConfigParserFactory());
        cachedFactories.put("properties", new PropertiesConfigParserFactory());
    }

    public static IConfigParserFactory getParserFactory(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        return cachedFactories.get(type.toLowerCase());
    }
}
