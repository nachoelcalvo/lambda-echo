package org.personal;

import java.util.HashMap;

public class EchoLambdaGateway {

    public Response handler(Request request){
        return new Response(200, String.format("Hello, %s !!!" , request.pathParameters.get("name")));
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
