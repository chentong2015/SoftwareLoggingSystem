package com.commons.logging;

import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

// Commons-logging default to java.util.logging. 基于Java Logging API来实现
// Commons-logging is just a logging facade, abstraction layer 只是一个抽象层
public class DemoCommonsLogging {

    private static final String ASSEMBLY_AUDIT_LOGGER_NAME = "assembly-audit";

    public static void main(String[] args) throws IOException {
        Logger.getGlobal().addHandler(new FileHandler("log"));
        LogFactory.getLog(DemoCommonsLogging.class).info("/log/mylog.log");

        LogFactory.getLog(ASSEMBLY_AUDIT_LOGGER_NAME).info("message test chen");
        LogFactory.getLog(ASSEMBLY_AUDIT_LOGGER_NAME).warn("this is warn messages");
        LogFactory.getLog(ASSEMBLY_AUDIT_LOGGER_NAME).debug("this is debug messages");
    }
}
