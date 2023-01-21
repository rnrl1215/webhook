package com.webhhook.slack.v1_webclient;

import com.webhhook.slack.webhook.MessageRequest;
import com.webhhook.slack.webhook.Webhook;
import com.webhhook.webclient.RequestType;
import com.webhhook.webclient.WebClientBase;
import com.webhhook.webclient.WebClientFactory;
import org.springframework.stereotype.Service;

@Service
public class WebclientSlackService implements Webhook {

    private String baseURL = "https://hooks.slack.com/services";
    private String alarmPath = "/T04KV4NG2FL/B04LMQTLARE/tXM48qlFJDvTJU9zytmmKL4W";

    @Override
    public void sendMessage(String text) {
        WebClientBase webClient = WebClientFactory.getWebClient(RequestType.POST);
        MessageRequest messageRequest = new MessageRequest(text);
        webClient.setRequestData(baseURL, alarmPath, messageRequest);
        webClient.callAPI();
    }
}
