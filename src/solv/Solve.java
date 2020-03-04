package solv;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solve {
    public static String  Readerferstnumber(int a, String opperand, int b) throws IOException {

        if (opperand.equals("+") ){
          int c = a + b;

          String l = "" + c;

          return  l;

        }
        else if (opperand.equals("-") ){
            int c = a - b;
            String l = "" + c;
            return  l;
        }
        else if (opperand.equals("*")){
            int c = a * b;
            String l = "" + c;
            return  l;
        }

        else if (opperand.equals("/")){
            int c = a / b;
            String l = "" + c;
            return  l;
        }
        else{
            throw new IllegalArgumentException();
        }

    }
}