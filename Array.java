// Kadane's Algorithm for max Subarray Sum

package DSA_Java;
import java.util.*;
public class Array {
  /*   public static void maxSubarraysSum(int num[]){
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];
        prefix[0] = num[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + num[i];
        }
        for(int i=0; i<num.length; i++){
            int start =i;
            for(int j= i; j< num.length; j++){
                int end = j;

                currSum = start ==0 ? prefix[end] : prefix[end] - prefix[start -1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum: "+maxSum);
    }*/

    public static void Kadane(int num[]){
        int ms = Integer.MIN_VALUE;
        int cs =0;
        for(int i=0; i<num.length; i++){
            cs = cs + num[i];
            if(cs < 0){
                cs =0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Max sum is: " + ms);
    }
    public static void main(String[] args) {
        int num[] = {1, -2, 6, -1, 3};
      //  maxSubarraysSum(num);
      Kadane(num);
    }
}
