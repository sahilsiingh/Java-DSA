import  java.util.*;
public class findDuplicateNos {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new  ArrayList<>();
        Arrays.sort(nums);
        for(int i = 1 ; i<nums.length; i++){
                if(nums[i] == nums[i-1]){
                res.add(nums[i]);
                }
            }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(nums));

    }
}