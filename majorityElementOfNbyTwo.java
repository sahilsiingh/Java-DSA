import java.util.*;
public class majorityElementOfNbyTwo {
    public static int majorityElement(int[] nums) {
    //     Arrays.sort(nums);
    //     int n = nums.length;
    //     return nums[n/2];
    // }

        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        int n = nums.length;

        for(int i =0; i<n;i++){
            if(map.containsKey(nums[i])){ // true
                map.put(nums[i] , map.get(nums[i]) +1);
            }
            else{
            map.put(nums[i] ,1);
            }  
            if(map.get(nums[i])>n/2){
                res = nums[i];
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int [] nums={2,3,2,4};
        System.out.println(majorityElement(nums));
    }
}