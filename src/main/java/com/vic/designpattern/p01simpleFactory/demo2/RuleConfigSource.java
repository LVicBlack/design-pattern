package com.vic.designpattern.p01simpleFactory.demo2;

import com.vic.designpattern.exception.DefaultException;
import org.junit.Test;

public class RuleConfigSource {
    public RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        RuleConfigParser parser = RuleConfigParserFactory.createParser(ruleConfigFileExtension);
        if (parser == null) {
            throw new DefaultException(
                    "Rule config file format is not supported: " + ruleConfigFilePath);
        }

        String configText = "abc";
        //从ruleConfigFilePath文件中读取配置文本到configText中
        return parser.parse(configText);
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
