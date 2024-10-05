public class minimumOfRotatedArray {
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int ans = nums[0];
        if(nums.length == 1){
            return ans;
        }

        while(left <= right){

            int mid = (left + right ) / 2;
            if(nums[left]<nums[right]){
            ans = Math.min(ans , nums[left]);
            break;
        }
            if(nums[left]<=nums[mid]){
                ans = Math.min(ans,nums[mid]);
                left = mid + 1;
            }
            else {
                right = mid - 1;
                ans = Math.min(ans, nums[mid]);
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int [] n = { 0,1,3,5,7,9};
        // after rotating
        int [] nums = { 5,7,9,0,1,3};
        System.out.println(findMin(nums));
    }
}
