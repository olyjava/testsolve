package solv;

import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
       String resultreader = solv.Reader.Readerferstnumber();
       String resultreder1 = solv.Reader1.Readerferstnumber(resultreader);
        String resultreder2 = solv.Reader2.Readeropperand(resultreader);
        String resultreder3 = solv.Reader3.Readersecondnumber(resultreader);
        int convernumbertresult = solv.ConverterNumbers.Convertnumbers(resultreder1,resultreder3);
        int convernumbertresult1 = solv.ConverterNumbers.Convertnumbers(resultreder3,resultreder1);
       String solveresult = solv.Solve.Readerferstnumber(convernumbertresult,resultreder2,convernumbertresult1);
        System.out.println(solv.ConvertinrtAnswer.Convertanswer(solveresult,resultreder1));
    }


}
