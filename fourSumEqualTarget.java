import java.util.*;
public class fourSumEqualTarget {
    public static List<List<Integer>> fourSum(int[] nums, int target) { 
        List<List<Integer>> res = new  ArrayList<>(); 
        int n =nums.length; 
        Arrays.sort(nums);

        for(int i = 0; i<n; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int j = i+1; j<n; j++){
                if(j>i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                int k = j+1;
                int l = n-1;
                while (k < l){
                long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                if(sum>target){
                    l--;
                }
                else if(sum<target){
                    k++;
                }
                else {
                        res.add(Arrays.asList(nums[i],nums[j], nums[k],
                        nums[l])); 
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k - 1]) {
                            k++;
                        }
                        while (k < l && nums[l] == nums[l + 1]) {
                            l--;
                        }
                    }
                }
            }    
        }
        
        return res;
    }
    public static void main(String[] args) {
        int [] nums = {1,0,-1,0,-2,2};
        int target = 0;
        System.out.println(fourSum(nums, target));
    }
}