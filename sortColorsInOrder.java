
import java.util.Arrays;

public class sortColorsInOrder {
    public static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        sortColors(nums);
    }
}
