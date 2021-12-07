package com.saiev.practice;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketConfig {
    private ServerSocket serverSocket;
    private Socket socket;

    {
        try {
            serverSocket = new ServerSocket(8080);
            System.out.println("Server started");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Socket getSocket() {
        try {
            socket = serverSocket.accept();
            System.out.println("New client connected");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return socket;
    }
}
