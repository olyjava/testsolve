package solv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public  class   Reader1 {
    public static String Readerferstnumber(String nomer) throws IOException {

        String[] nomers = nomer.split("\\s");

        String firstnomer = nomers[0];


        return firstnomer;

    }
}




