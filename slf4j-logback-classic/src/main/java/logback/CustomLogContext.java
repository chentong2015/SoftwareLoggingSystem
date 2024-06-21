package logback;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.LoggerFactory;

public class CustomLogContext {

    public void createLogger() {
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();

        FileAppender fileAppender = new FileAppender();
        fileAppender.setContext(loggerContext);
        fileAppender.setName("timestamp");
        fileAppender.setFile("log/" + System.currentTimeMillis()+".log");

        PatternLayoutEncoder encoder = new PatternLayoutEncoder();
        encoder.setContext(loggerContext);
        encoder.setPattern("%r %thread %level - %msg%n");
        encoder.start();

        fileAppender.setEncoder(encoder);
        fileAppender.start();

        Logger logbackLogger = loggerContext.getLogger("Main");
        logbackLogger.addAppender(fileAppender);

        // OPTIONAL: print logback internal status messages
        StatusPrinter.print(loggerContext);

        logbackLogger.debug("hello");
    }
}
