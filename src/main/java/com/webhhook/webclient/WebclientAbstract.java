package com.webhhook.webclient;

public abstract class WebclientAbstract <T> {
    abstract public void initWebclient(String baseURL);
    abstract public void setRequestData(String baseURL, String path, T t);
}
