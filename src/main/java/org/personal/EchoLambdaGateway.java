package org.personal;

import java.util.HashMap;
import java.util.UUID;

public class EchoLambdaGateway {

    private String lambdaId = UUID.randomUUID().toString();

    public Response handler(Request request) throws InterruptedException {
        Thread.sleep(3000);
        return new Response(200, String.format("Hello, %s from %s !!!",
                request.pathParameters.get("name"), lambdaId));
    }

    public static class Request {

        public HashMap<String, String> pathParameters = new HashMap<>();
    }

    public static class Response {

        public Integer statusCode;
        public String body;

        Response(Integer statusCode, String body) {
            this.statusCode = statusCode;
            this.body = body;
        }
    }
}
