
import java.util.Arrays;

public class twoSumWith1Idx {
    public static  int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;

        while (l < r) {
            int curSum = numbers[l] + numbers[r];

            if (curSum > target) {
                r--;
            } else if (curSum < target) {
                l++;
            } else {
                return new int[] { l + 1, r + 1 };
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int[] numbers  = {2,5,7,8,10,14};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
}