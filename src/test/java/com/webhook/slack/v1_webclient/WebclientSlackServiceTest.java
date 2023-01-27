package com.webhook.slack.v1_webclient;

import com.webhook.slack.webhook.MessageRequest;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.Arrays;

class WebclientSlackServiceTest {
    WebclientSlackService slackService;

    @Test
    public void test() {
        slackService = new WebclientSlackService();
        slackService.sendMessage("TEST");
    }


    @Test
    public void simpleTest() {

        String[] version = {"0.91","1.999999","1.2.3", "2.2", "3", "2.8", "2.7.1", "1.23.1","3.1.0","3.1.1","31"};
        Arrays.sort(version);

    }
}