import java.util.Arrays;

public class duplicateNumbertrue {
    public static  boolean duplicateNumber(int[] nums) {
        Arrays.sort(nums);

        for(int i = 1; i<nums.length-1;i++){
            if(nums[i]!=nums[i-1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,2};
        System.out.println(duplicateNumber(nums));
        
    }
}
