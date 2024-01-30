package com.slf4j.main.listener;

public interface TracedRequestListener {

    default void onRequestStarted(String propertiesNode) {
    }

    default void onRequestFinished(String propertiesNode) {
    }
}
