package base.logback.main;

public class BaseLogbackConfiguration {

    /**
     * Logback Initialization Steps: 配置的文件需要在resources资源文件中 !!!
     * 1. Find logback-test.xml in classpath
     * 2. Find logback.groovy in classpath
     * 3. Find logback.xml in classpath
     * 4. Resolve the implementation of Configurator interface
     * 5. (默认情况) logback configures itself automatically using BasicConfigurator, logging output to console
     */

    /**
     * Pattern Conversion: ===> http://logback.qos.ch/manual/layouts.html#conversionWord 自定义格式转换 !!
     * %date [%thread name] [%-5level] %logger name{40} - %message %n
     * 2021-03-12 13:20:22,066 [main] [INFO ] com.ctong.basic - log info
     * 2021-03-12 13:20:22,066 [main] [DEBUG] com.ctong.basic(这里最多显示40个字符, 超出则前面的名称省略) - log debug
     */

    /**
     * Log Level基本级别分布:
     * <logger name="org.module" level="TRACE"/> 通过配置来筛选和过滤指定级别及其"以上"的level
     * log.trace("Trace Message!");
     * log.debug("Debug Message!");
     * log.info("Info Message!");
     * log.warn("Warn Message!");
     * log.error("Error Message!");
     * log.fatal("Fatal Message!");
     * log.off("off level");
     * log.setLevel(Level.WARN); 该过滤只会使得是会输出warn, error, fatal等比较严重的错误 !!
     */
}
