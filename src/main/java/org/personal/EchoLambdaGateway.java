package org.personal;

import com.amazonaws.services.lambda.runtime.Context;

import java.util.HashMap;
import java.util.UUID;

public class EchoLambdaGateway {

    private String lambdaId = UUID.randomUUID().toString();

    public Response handler(Request request, Context context) {

        String greeting = System.getenv().getOrDefault("GREETING", "Hey");

        return new Response(200, String.format("%s, %s from %s  with remaining millis %s and version %s!!!",
                greeting,
                request.pathParameters.get("name"),
                lambdaId,
                context.getRemainingTimeInMillis(),
                context.getFunctionVersion()));
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
