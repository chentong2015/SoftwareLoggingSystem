package org.example.main;

import org.apache.log4j.Level;
import org.apache.log4j.spi.LoggingEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerMessageTest {

    // TODO. 通过LoggingEvent事件来测试日志输出的数据是否符合要求
    @Test
    public void test() {
        CustomAppender appender = new CustomAppender();
        MyProjectClass projectClass = new MyProjectClass(appender);
        projectClass.testLogMessage();

        LoggingEvent firstLogEntry = appender.getLog().get(0);
        Assertions.assertEquals(firstLogEntry.getLevel(), Level.INFO);
        Assertions.assertEquals(firstLogEntry.getMessage(), "Test");
        Assertions.assertEquals(firstLogEntry.getLoggerName(), "org.example.main.MyLogger");
    }
}
