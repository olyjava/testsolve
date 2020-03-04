package solv;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
    public static String Readerferstnumber() throws IOException {

        String sAge;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите операцию в формате 1 + 2 или I + II,");

            System.out.println("Введите числа и знак через пробел как указано в примере:");
             sAge = reader.readLine();

             return sAge;
        }




    }


