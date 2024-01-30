package logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// TODO. Logback主要组成components
// 1. Loggers   <logger></logger>    (负责获取日志信息)
// 2. Appender  <appender></appender>(负责publish发布日志信息到不同输出destination): Console, File, Socket
// 3. Layouts   <pattern></pattern>  (负责格式化日志信息的风格): 通过实现Layout接口可以实现更改
// 4. Configurator interface         自定义要实现的配置
public class BaseLogback {

    // Logback Initialization Steps: 配置的文件需要在resources资源文件中 !!!
    // 1. Find logback-test.xml in classpath
    // 2. Find logback.groovy in classpath
    // 3. Find logback.xml in classpath
    // 4. Resolve the implementation of Configurator interface
    // 5. (默认情况) logback configures itself automatically using BasicConfigurator, logging output to console
    public static void main(String[] args) {
        // Set logger to class.getName() 设置logger的名称
        Logger logger = LoggerFactory.getLogger(BaseLogback.class);
        logger.info("logging info");
        logger.info("logging {}", "place holder"); // logger支持使用{}站位符, 使用后面提供的值
        logger.debug("logging debug");
        logger.warn("logging warn");
        logger.error("logging warn");
    }
}
