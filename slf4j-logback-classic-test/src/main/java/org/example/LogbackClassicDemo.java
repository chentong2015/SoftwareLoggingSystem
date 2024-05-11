package org.example;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

public class LogbackClassicDemo {

    // TODO. System Property将会自动被设置到.xml中变量的值
    public static void main(String[] args) {
        System.setProperty("logFileDir", "/log"); // 系统的绝对路径
        System.setProperty("logFileName", "logger");

        Logger logger = (Logger) LoggerFactory.getLogger(LogbackClassicDemo.class);

        logger.info("logging {}", "place holder");
        logger.debug("logging debug");
        logger.warn("logging warn");
        logger.error("logging warn");
    }
}