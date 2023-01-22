package com.webhook.webclient;

public abstract class WebclientAbstract <T> {
    abstract public void initWebclient(String baseURL);
    abstract public void setRequestData(String baseURL, String path, T t);
}
