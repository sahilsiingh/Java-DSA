public class binarySearch {
    public static int search(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(target>nums[mid])
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] nums = {1,3,6,13,45,74,567,1345,62567,472256};
        int target = 74;
        System.out.println(search(nums, target));
    }
}
