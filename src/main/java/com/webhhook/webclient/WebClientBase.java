package com.webhhook.webclient;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class WebClientBase<T> extends WebclientAbstract<T> implements WebClientInterface{

    protected WebClient webclient;
    protected Mono<String> stringMono;

    @Override
    public void initWebclient(String baseURL) {
        webclient = WebClient.builder()
                .baseUrl(baseURL)
                .build();
    }

    @Override
    public void setRequestData(String baseURL, String path, T t) {
    }

    @Override
    public void callAPI() {
        String block = stringMono
                .block();
    }
}
