package com.vic.designpattern.p03AbstractFactory.demo1;

import com.vic.designpattern.exception.DefaultException;
import com.vic.designpattern.p03AbstractFactory.demo1.factory.IConfigParserFactory;
import org.junit.Test;

public class ConfigSource {
    public IConfigParserFactory load(String configFilePath) {
        String configFileExtension = getFileExtension(configFilePath);
        IConfigParserFactory parserFactory = ConfigParserFactoryMap.getParserFactory(configFileExtension);
        if (parserFactory == null) {
            throw new DefaultException(
                    "Rule config file format is not supported: " + configFilePath);
        }
        return parserFactory;
    }

    private String getFileExtension(String filePath) {
        //...解析文件名获取扩展名，比如rule.json，返回json
        return filePath;
    }

    @Test
    public void test(){
        IConfigParserFactory parserFactory = load("Json");
        String text = "abc";
        System.out.println(parserFactory.createRuleParser().parse(text));
        System.out.println(parserFactory.createSystemParser().parse(text));
    }
}
