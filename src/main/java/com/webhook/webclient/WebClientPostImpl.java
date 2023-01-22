package com.webhook.webclient;

import org.springframework.http.MediaType;

public class WebClientPostImpl<T> extends WebClientBase<T>{

    @Override
    public void setRequestData(String baseURL, String path, T body) {
        if (body == null) {
            throw new IllegalArgumentException("body 는 필수값 입니다.");
        }
        super.initWebclient(baseURL);
        super.stringMono = this.webclient.post()
                .uri(path)
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(body)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class);
    }
}
