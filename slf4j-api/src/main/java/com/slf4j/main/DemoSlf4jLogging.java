package com.slf4j.main;

import com.slf4j.main.listener.LoggerListener;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.LoggerConfig;
import org.apache.logging.log4j.core.impl.Log4jLogEvent;

import java.util.ArrayList;
import java.util.List;

public class DemoSlf4jLogging {

    private static Appender appender;
    private static List<LogEvent> captorLoggingEvent = new ArrayList<>();

    public static void main(String[] args) {
        LogEvent logEvent = new Log4jLogEvent();
        captorLoggingEvent.add(logEvent);

        LogEvent event = captorLoggingEvent.get(0);
        System.out.println(event.getLevel() == Level.INFO);

        captorLoggingEvent.clear();
    }

    // 关于日志信息测试:
    // 当检测到程序中存在日志输出时，通过LogEvent来获取输出日志并判断
    public static void testLogContext() {
        LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
        Configuration config = ctx.getConfiguration();
        LoggerConfig loggerConfig = config.getLoggerConfig(LoggerListener.class.getName());
        loggerConfig.addAppender(appender, Level.INFO, null);
        ctx.updateLoggers();
    }
}
