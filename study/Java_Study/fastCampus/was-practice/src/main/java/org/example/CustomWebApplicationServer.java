package org.example;

import org.example.calculator.Calculator;
import org.example.calculator.calculate.PositiveNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CustomWebApplicationServer {

    private final int port;

    private final ExecutorService executorService = Executors.newFixedThreadPool(10);

    private static final Logger logger = LoggerFactory.getLogger(CustomWebApplicationServer.class);

    public CustomWebApplicationServer(int port) {
        this.port = port;
    }

    public void start() throws IOException {
        try(ServerSocket serverSocket = new ServerSocket(port)) { // 해당 포트로 서버 소켓을 만듬
            logger.info("[CustomerWebApplicationServer] started {} port.", port);

            Socket clientSocket;
            logger.info("[CustomerWebApplicationServer] waiting for client.");

            // 서버 소켓이 클라이언트를 기다리게 하고 클라이언트가 들어오면 클라이언트 소켓이 만들어 지고 null이 아니게 되므로 while문 안으로 진입한다.
            while ((clientSocket = serverSocket.accept()) != null) {
                logger.info("[CustomerWebApplicationServer] client connected!");

                // Step3 - Thread Pool을 적용해 안정적인 서비스가 가능하도록 한다.
                executorService.execute(new ClientRequestHandler(clientSocket));
            }
        }
    }
}
