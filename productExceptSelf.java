
import java.util.Arrays;

public class productExceptSelf {
    public static int[] productOfExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            int prd = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    System.out.println(nums[j]);
                    prd = prd * nums[j];
                }
            }
            res[i] = prd;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 1,2,4,6 };
        System.out.println(Arrays.toString(productOfExceptSelf(nums)));
    }
}