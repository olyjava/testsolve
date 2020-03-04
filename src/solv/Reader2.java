package solv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Reader2 {
    public static String Readeropperand(String nomer) throws IOException {

        String[] nomers = nomer.split("\\s");

        String operand = nomers[1];


        return  operand;
    }
}