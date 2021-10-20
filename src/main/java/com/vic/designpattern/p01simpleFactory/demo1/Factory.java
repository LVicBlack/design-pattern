package com.vic.designpattern.p01simpleFactory.demo1;

import cn.hutool.core.util.StrUtil;
import com.vic.designpattern.p01simpleFactory.demo1.impl.HatchbackCar;
import com.vic.designpattern.p01simpleFactory.demo1.impl.JeepCar;
import com.vic.designpattern.p01simpleFactory.demo1.impl.SportCar;

import java.util.HashMap;
import java.util.Map;


public class Factory {
    private static final Map<String, ICar> cachedParsers = new HashMap<>();

    static {
        cachedParsers.put("HATCHBACK", new HatchbackCar());
        cachedParsers.put("JEEP", new JeepCar());
        cachedParsers.put("SPORT", new SportCar());
    }

    public static ICar createCar(String type) {
        if (StrUtil.isBlank(type)) {
            return null;
        }
        return cachedParsers.get(type.toUpperCase());
    }
}
