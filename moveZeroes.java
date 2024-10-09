
import java.util.Arrays;

public class moveZeroes {
    public static void moveZeroes(int[] nums) {
                for(int i = 0; i<nums.length ; i++){
                    for(int j = i+1; j<nums.length ; j++){
                            if(nums[i]==0){
                                int temp = nums[i];
                                nums[i] = nums[j];
                                nums[j] = temp;
                            }
                    }
                }   
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 3, 0, 12 };
        moveZeroes(nums);
        }
}
