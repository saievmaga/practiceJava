package com.saiev.practice;


public class WebServer {

    public static void main(String[] args) {
        SocketConfig socketConfig = new SocketConfig();

        while (true) {
            HandleRequest handleRequest = new HandleRequest(socketConfig.getSocket());
           new Thread(handleRequest::request).start();
        }
    }
}