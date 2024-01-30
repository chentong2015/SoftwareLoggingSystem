package com.log4j.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseLogTester {

    private final Logger logger;

    public BaseLogTester() {
        this(LogManager.getLogger(BaseLogTester.class.getName()));
    }

    // TODO. 通过构造器注入用于测试的自定义Logger
    public BaseLogTester(Logger logger) {
        this.logger = logger;
        logger.debug("My log debug message");
        logger.info("My log info message");
        logger.warn("My log warn message");
        logger.error("My log error message");
    }
}
