package org.example;

import org.example.calculator.Calculator;
import org.example.calculator.calculate.PositiveNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class CustomWebApplicationServer {

    private final int port;

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

                // Step1 - 사용자 요청을 메인 Thread가 처리하도록 한다.

                try (InputStream in = clientSocket.getInputStream(); OutputStream out = clientSocket.getOutputStream()) {
                    // line by line으로 읽기 위해 InputStream을 BufferedReader로 바꿈
                    BufferedReader br = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
                    DataOutputStream dos = new DataOutputStream(out);

                    HttpRequest httpRequest = new HttpRequest(br);

                    if (httpRequest.isGetRequest() && httpRequest.matchPath("/calculate")) {
                        QueryStrings queryStrings = httpRequest.getQueryStrings();

                        int operand1 = Integer.parseInt(queryStrings.getValue("operand1"));
                        String operator = queryStrings.getValue("operator");
                        int operand2 = Integer.parseInt(queryStrings.getValue("operand2"));

                        int result = Calculator.calculator(new PositiveNumber(operand1), operator, new PositiveNumber(operand2));
                        byte[] body = String.valueOf(result).getBytes();

                        HttpResponse response = new HttpResponse(dos);
                        response.response200Header("application/json", body.length);
                        response.responseBody(body);
                    }
                }
            }
        }
    }
}