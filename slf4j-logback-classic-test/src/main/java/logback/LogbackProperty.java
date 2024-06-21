package logback;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

public class LogbackProperty {

    public static void main(String[] args) {
        System.setProperty("logFileDir", "/log"); // 系统的绝对路径
        System.setProperty("logFileName", "logger");

        Logger logger = (Logger) LoggerFactory.getLogger(LogbackProperty.class);
        logger.info("logging {}", "place holder");
        logger.debug("logging debug");
        logger.warn("logging warn");
        logger.error("logging warn");
    }
}