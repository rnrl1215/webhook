package com.webhook.slack.webhook;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MessageRequest {
    private String text;

    public MessageRequest(String text) {
        this.text = text;
    }
}
