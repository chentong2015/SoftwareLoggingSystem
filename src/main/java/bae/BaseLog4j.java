package bae;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// 通过Properties文件来配置日志的输出，注意配置文件的不同
// https://logging.apache.org/log4j/2.x/manual/configuration.html
// https://logging.apache.org/log4j/2.x/manual/layouts.html
public class BaseLog4j {

    // 自定义logger日志的名称
    private static final Logger logger = LogManager.getLogger("myLogger");
    private static final Logger newLogger = LogManager.getLogger(BaseLog4j.class.getName());
    private static final Logger newLogger2 = LogManager.getLogger();

    private static void testLoggerBasic() {
        if (logger.isDebugEnabled()) {
            // debug() 输出信息的形式可以格式化
            logger.debug("debug message");
            logger.debug("Integer.MAX_VALUE = %,d", Integer.MAX_VALUE);
            logger.debug("Long.MAX_VALUE = %,d", Long.MAX_VALUE);
        }

        logger.printf(Level.ERROR, "error level");
        logger.error("error message"); // By default, output this

        // 提供的lambda expressions只有在trace enabled的时候被执行
        // logger.trace("Some long-running operation returned {}", () -> expensiveOperation());
    }

    public static void main(String[] args) {
        logger.debug("Main debug message");
        logger.info("Main info message");
        logger.warn("Main warn message");
        logger.error("Main error message");
        System.out.println("-------------");
    }
}
