package com.vic.designpattern.p01SimpleFactory.demoDB;

import com.google.common.collect.ImmutableMap;

import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class UserDaoFactory {
    public static final Map<String, Supplier<UserDao>> CONSTRUCTOR_MAP =
            ImmutableMap.of(
                    "mysql", UserDaoMySQLImpl::new,
                    "oracle", UserDaoOracleImpl::new
            );

    public static UserDao createUserDao(String database) {
        return Optional.ofNullable(CONSTRUCTOR_MAP.get(database.toLowerCase()))
                .orElseThrow(IllegalArgumentException::new)
                .get();
    }
}
