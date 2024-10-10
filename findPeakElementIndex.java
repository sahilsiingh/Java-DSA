public class findPeakElementIndex {
    public  static int findPeakElement(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int maxValue = nums[0];
        int maxIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
                maxIndex = i;
                
            }
            
        }
        return maxIndex;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));
    }
}
