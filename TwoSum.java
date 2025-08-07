package DSA_Java;
import java.util.*;
public class TwoSum {
    public int[] twoSum(int nums[], int target){
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            int num = nums[i];
            int moreneeded = target - num;
            if(map.containsKey(moreneeded)){
                return new int[] {map.get(moreneeded), i};
            }
            map.put(num, i);
            
        }
        return new int[] {-1, -1};

    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 4, 6, 8};
        int target =10;

         TwoSum ts = new TwoSum();  
        int[] result = ts.twoSum(nums, target); 

        System.out.println(Arrays.toString(result));
    }
}
