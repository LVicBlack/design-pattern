package com.vic.designpattern.p03AbstractFactory.demoDB.planB;

import com.google.common.collect.ImmutableMap;
import com.vic.designpattern.p03AbstractFactory.demoDB.dao.*;

import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * 考虑将UserDao和LogDao更改为MySQLBaseDao和OracleBaseDao, 实现类为不同的表更为合理
 */
public class DataAccess {
    public static final Map<String, Supplier<UserDao>> userDaoMap = ImmutableMap.of(
            "mysql", UserDaoMySQLImpl::new,
            "oracle", UserDaoOracleImpl::new
    );
    public static final Map<String, Supplier<LogDao>> logDaoMap = ImmutableMap.of(
            "mysql", LogDaoMySQLImpl::new,
            "oracle", LogDaoOracleImpl::new
    );

    private String DB;

    public DataAccess(String DB) {
        this.DB = DB;
    }

    public UserDao createUserDao(){
        return Optional.ofNullable(userDaoMap.get(DB))
                .orElseThrow(IllegalArgumentException::new)
                .get();
    }

    public LogDao createLogDao(){
        return Optional.ofNullable(logDaoMap.get(DB))
                .orElseThrow(IllegalArgumentException::new)
                .get();
    }
}
