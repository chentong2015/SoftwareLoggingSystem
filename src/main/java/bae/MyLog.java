package bae;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyLog {

    private final Logger logger;

    // TODO: 通过构造器，提供logger的自定义注入的功能
    // 在使用时，可以使用不同的logger进行测试
    public MyLog() {
        this(LogManager.getLogger(MyLog.class.getName()));
    }

    public MyLog(Logger logger) {
        this.logger = logger;
        logger.debug("My log debug message");
        logger.info("My log info message");
        logger.warn("My log warn message");
        logger.error("My log error message");
    }
}
