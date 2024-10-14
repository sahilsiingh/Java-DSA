import java.util.*;
public class intersectionOfTwoArrays {

    public static int [] intersection (int [] num1, int [] num2){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();


        for(int i =0; i<num1.length; i++){
            set.add(num1[i]);
        }

        for(int j =0; j<num2.length; j++){
            if(set.contains(num2[j])){
            set1.add(num2[j]);
            set.remove(num2[j]);
            }
        }

        // Convert HashSet to int[]
        int[] result = new int[set1.size()];
        int index = 0;
        for (Integer num : set1) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int [] num1 = {2,5,9};
        int [] num2 = {8,9,4,11,3,5,7};

        System.out.println(Arrays.toString(intersection(num1, num2)));
    }
}