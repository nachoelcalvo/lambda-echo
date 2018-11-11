package org.personal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamLambda {

    public void handler(InputStream input, OutputStream output) throws IOException {

        int letter;
        while ((letter = input.read()) != -1){
            output.write(Character.toUpperCase(letter));
        }
    }
}
