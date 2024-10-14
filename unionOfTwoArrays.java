import java.util.*;
public class unionOfTwoArrays {

    public static int [] union (int [] num1, int [] num2){
        HashSet<Integer> set = new HashSet<>();

        for(int i =0; i<num1.length; i++){
            set.add(num1[i]);
        }
        for(int i =0; i<num2.length; i++){
            set.add(num2[i]);
        }

        // Convert HashSet to int[]
        int[] result = new int[set.size()];
        int index = 0;
        for (Integer num : set) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int [] num1 = {2,5,9};
        int [] num2 = {8,2,9,4,11,2,5,7};

        System.out.println(Arrays.toString(union(num1, num2)));
    }
}