package bae.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 1. Logging API : SLF4J API:
 * ___ http://www.slf4j.org/apidocs/
 * ___ http://www.slf4j.org/apidocs/org/slf4j/Logger.html
 * .
 * 2. Logging Implementation: LogBack
 * ===> 对log4j implementation的延续和提升(出自同一个作者)
 * ___ Logback is build by Maven
 * ___ Logback 可在运行的时候通过外部配置文件进行配置: 设置levels, destinations(db, file, console, email,,,)
 * ___ Logback supports xml and groovy configurations
 * --- Logback auto reload the configuration files, remove old log archives
 */
// Logging System 日志系统，两者缺一不可
// 1. Logging API: Facade or interface that interact with
// 2. Logging Implementation: Logging API use internally and work,
//    has their own way fo configuring the log output
public class BaseLogback {

    /**
     * Logback 的主要组成 components
     * 1. Loggers   <logger></logger>    (负责获取日志信息)
     * 2. Appenders <appender></appender>(负责publish发布日志信息到不同输出destination): Console, File, Socket
     * 3. Layouts   <pattern></pattern>  (负责格式化日志信息的风格): 通过实现Layout接口可以实现更改
     * 4. Configurator interface         自定义要实现的配置
     */

    /**
     * 1. 添加指定的dependency到maven中
     * Transitive Dependencies  ==> 可以下载Sources和Documentation
     * - logback-classic
     * ---- logback-core
     * ---- slf4j-api 不需要再添加这个dependency，它是logback-classic的Dependency，可以通过logback-classic
     * .
     * 2. 刷新Maven: reload all maven projects & 或者运行Maven Goal: clean install
     * Maven会自动找到添加的dependency, 自动下载到local maven repository, 添加到Dependencies和项目External Libraries
     * Settings > Build Execution Deployment > Build Tools > Maven > local maven repository
     * 找到本地的下载的仓库，可多个项目共享 C:\Users\CHEN Tong\.m2\repository\ch\qos\logback
     */
    public static void main(String[] args) {
        // Set logger to class.getName() 设置logger的名称
        Logger logger = LoggerFactory.getLogger(BaseLogback.class);
        logger.info("logging info");
        logger.info("logging {}", "place holder"); // logger支持使用{}站位符, 使用后面提供的值
        logger.debug("logging debug");
    }
}
