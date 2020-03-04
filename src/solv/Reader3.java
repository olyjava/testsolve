package solv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader3 {
    public static String Readersecondnumber(String nomer) throws IOException {

        String[] nomers = nomer.split("\\s");

        String secondnomer = nomers[2];


        return  secondnomer;
    }
    }