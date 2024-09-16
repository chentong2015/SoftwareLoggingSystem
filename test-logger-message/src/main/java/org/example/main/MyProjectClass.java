package org.example.main;

import org.apache.log4j.Logger;

// create your own Appender and add it to the logger you want
// remove the Appender when it's done, otherwise memory leak !
public class MyProjectClass {

    // 通常可以将Appender追加到RootLogger中
    private final Logger rootLogger = Logger.getRootLogger();
    private Logger logger = Logger.getLogger(MyProjectClass.class);

    private CustomAppender customAppender;

    public MyProjectClass(CustomAppender customAppender) {
        this.customAppender = customAppender;
    }

    // TODO. 注入自定义的Logger来测试日志信息的输出
    //  injectLogger中包含自定义的CustomAppender
    // @VisibleForTesting
    public MyProjectClass(Logger injectLogger) {
        this.logger = injectLogger;
    }

    // TODO. 确定移除添加到特定Logger的Appender
    public void testLogMessage() {
        try {
            logger.addAppender(this.customAppender);
            logger.info("Test");
        } finally {
            logger.removeAppender(this.customAppender);
        }
    }
}
