package org.personal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EchoLoggingLambda {

    public static final Logger logger = LoggerFactory.getLogger(EchoLoggingLambda.class);

    public void handler(String input){
        logger.info("Hello {} ", input);
    }
}
