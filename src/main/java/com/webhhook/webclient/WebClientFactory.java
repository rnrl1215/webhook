package com.webhhook.webclient;

import com.webhhook.slack.webhook.MessageRequest;
public class WebClientFactory {

    public static WebClientBase getWebClient(RequestType requestType) {
        return switch (requestType) {
            case POST -> new WebClientPostImpl<MessageRequest>();
            default -> throw new IllegalStateException("not support: " + requestType);
        };
    }
}
