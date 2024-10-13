import  java.util.*;
public class majorityElementNbyThree {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashMap <Integer ,Integer> map= new HashMap<>();
        int n = nums.length ;

        for(int i =0; i<n;i++){
            if(map.containsKey(nums[i])){ // true
                map.put(nums[i] , map.get(nums[i]) +1);
            }
            else{
            map.put(nums[i] ,1);
            }  
        }

        for(int key : map.keySet()){
            if(map.get(key)>n/3){
                res.add(key);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int [] nums={2,2,2,2,3,4};
        System.out.println(majorityElement(nums));
    }
}