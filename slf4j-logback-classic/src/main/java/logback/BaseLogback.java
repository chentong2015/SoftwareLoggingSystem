package logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseLogback {

    public static void main(String[] args) {
        // Set logger to class.getName() 设置logger的名称
        Logger logger = LoggerFactory.getLogger(BaseLogback.class);
        logger.info("logging info");

        // logger支持使用{}占位符, 使用后面提供的值
        logger.info("logging {}", "place holder");
        logger.debug("logging debug");
        logger.warn("logging warn");
        logger.error("logging warn");
    }
}
