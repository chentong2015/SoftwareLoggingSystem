package com.commons.logging;

import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

// Commons-logging default to java.util.logging 基于Java Logging API来实现
// Commons-logging 一个抽象层facade, abstraction layer
public class DemoCommonsLogging {

    private static final String ASSEMBLY_AUDIT_LOGGER_NAME = "assembly-audit";

    // 基于代码来实现log文件名称随时间而定义
    public static void main(String[] args) throws IOException {
        Logger.getGlobal().addHandler(new FileHandler("log"));
        LogFactory.getLog(DemoCommonsLogging.class).info("/log/mylog.log");

        LogFactory.getLog(ASSEMBLY_AUDIT_LOGGER_NAME).info("message test chen");
        LogFactory.getLog(ASSEMBLY_AUDIT_LOGGER_NAME).warn("this is warn messages");
        LogFactory.getLog(ASSEMBLY_AUDIT_LOGGER_NAME).debug("this is debug messages");
    }
}
