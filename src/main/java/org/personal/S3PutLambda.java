package org.personal;

import com.amazonaws.services.lambda.runtime.events.S3Event;

public class S3PutLambda {

    public void handler(S3Event input){
        System.out.println(input.getRecords().get(0).getS3().getObject().getKey());
    }
}
