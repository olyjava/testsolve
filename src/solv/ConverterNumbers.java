package solv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class ConverterNumbers {
    public static int Convertnumbers(String nomer,String resultreder1) throws IOException {
        String roman1[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String arabic1[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        int nAge = 0;
        List<String> roman = new ArrayList<>();
        for (int i = 0; i < roman1.length; i++) {
            roman.add(roman1[i]);

        }

        List<String> arabic = new ArrayList<>();
        for (int i = 0; i < arabic1.length; i++) {
            arabic.add(arabic1[i]);

        }

if((arabic.contains(resultreder1)) &&  ((arabic.contains(nomer))) || (roman.contains(resultreder1)) &&  ((roman.contains(nomer)))) {


        if (roman.contains(nomer)) {

            int a = roman.indexOf(nomer);

            nomer = arabic.get(a);

            nAge = parseInt(nomer);

        } else if (arabic.contains(nomer)) {
            nAge = parseInt(nomer);


        } else {

            throw new IllegalArgumentException();
        }


} else {

    throw new IllegalArgumentException();
}
        return nAge;
    }


    }

