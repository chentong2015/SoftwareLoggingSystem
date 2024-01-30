package com.slf4j.main.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerListener implements TracedRequestListener {

    private static final LoggerListener INSTANCE = new LoggerListener();
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerListener.class);

    // 判断Logger指定的Level配置有没有Enable
    public static boolean isActivated() {
        return LOGGER.isInfoEnabled();
    }

    public static LoggerListener instance() {
        return INSTANCE;
    }

    @Override
    public void onRequestFinished(String propertiesNode) {
        if (isActivated()) {
            LOGGER.info(propertiesNode);
        }
    }
}
