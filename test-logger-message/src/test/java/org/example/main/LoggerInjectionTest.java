package org.example.main;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggingEvent;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoggerInjectionTest {

    private CustomAppender customAppender;
    private final Logger logger = Logger.getLogger("LoggerInjectionTest");

    @BeforeEach
    public void setup() {
        this.customAppender = new CustomAppender();
        this.logger.addAppender(this.customAppender);
    }

    @AfterEach
    public void cleanup() {
        this.logger.removeAppender(this.customAppender);
    }

    @Test
    public void testInjectionLoggerMessage() {
        LoggerInjectionClass injectionClass = new LoggerInjectionClass("name", "url", this.logger);
        injectionClass.testLogMessage();

        LoggingEvent logEvent1 = customAppender.getLog().get(0);
        Assertions.assertEquals(logEvent1.getLevel(), Level.INFO);
        Assertions.assertEquals(logEvent1.getMessage(), "info message");
        Assertions.assertEquals(logEvent1.getLoggerName(), "LoggerInjectionTest");

        LoggingEvent logEvent2 = customAppender.getLog().get(1);
        Assertions.assertEquals(logEvent2.getLevel(), Level.DEBUG);
        Assertions.assertEquals(logEvent2.getMessage(), "debug");
        Assertions.assertEquals(logEvent2.getLoggerName(), "LoggerInjectionTest");
    }
}
