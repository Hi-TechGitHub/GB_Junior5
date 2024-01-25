package org.example;

import java.io.IOException;
import java.net.ServerSocket;

public class Program {
    public static void main(String[] args) {
        try{
        ServerSocket socket = new ServerSocket(8000);
        Server server = new Server(socket);
        server.runServer();

    } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
