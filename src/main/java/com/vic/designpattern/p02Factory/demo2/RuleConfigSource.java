package com.vic.designpattern.p02Factory.demo2;

import com.vic.designpattern.exception.DefaultException;
import com.vic.designpattern.p01SimpleFactory.demo2.pojo.RuleConfig;
import com.vic.designpattern.p02Factory.demo2.factory.IRuleConfigParserFactory;
import org.junit.Test;

public class RuleConfigSource {
    public RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParserFactory parserFactory = RuleConfigParserFactoryMap.getParserFactory(ruleConfigFileExtension);
        if (parserFactory == null) {
            throw new DefaultException(
                    "Rule config file format is not supported: " + ruleConfigFilePath);
        }

        String configText = "abc";
        //从ruleConfigFilePath文件中读取配置文本到configText中
        return parserFactory.createParser().parse(configText);
    }

    private String getFileExtension(String filePath) {
        //...解析文件名获取扩展名，比如rule.json，返回json
        return filePath;
    }

    @Test
    public void test(){
        RuleConfig ruleConfig = load("Json");
        System.out.println(ruleConfig);
    }
}
