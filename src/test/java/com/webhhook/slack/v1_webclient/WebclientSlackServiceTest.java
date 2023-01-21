package com.webhhook.slack.v1_webclient;

import com.webhhook.slack.webhook.MessageRequest;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

class WebclientSlackServiceTest {
    WebclientSlackService slackService;

    @Test
    public void test() {
        slackService = new WebclientSlackService();
        slackService.sendMessage("TEST");
    }


    @Test
    public void simpleTest() {
        WebClient webclient = WebClient.builder()
                .baseUrl("https://hooks.slack.com/services")
                .build();

        MessageRequest message = MessageRequest.builder()
                .text("알림 테스트")
                .build();

        webclient.post()
                .uri("/T04KV4NG2FL/B04LMQTLARE/tXM48qlFJDvTJU9zytmmKL4W")
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(message)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}