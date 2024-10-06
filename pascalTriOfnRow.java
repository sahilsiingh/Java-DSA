import  java.util.*;
public class pascalTriOfnRow {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer>res = new ArrayList<>();
        long comb = 1;
        // for long row values

        for(int j=0; j<=rowIndex; j++) {
            res.add((int)comb); // int used for converting long type into int type.
            comb = comb*(rowIndex - j) / (j + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int rowIndex = 30;
        System.out.println(getRow(rowIndex));
    }
}