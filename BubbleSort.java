package DSA_Java;
import java.util.Arrays;
import java.util.Collections;
public class BubbleSort {
    public static void bubble(Integer arr[]){
        for(int turns=0; turns<arr.length-1;turns++){
            for(int j=0; j<arr.length-1-turns; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                arr[j+1] = temp;                }
            }
        }
    }
    public static void print(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Integer arr[] = {5,2,1,4,3};
        //Arrays.sort(arr);
        //Arrays.sort(arr,0,3);
       // bubble(arr);
       Arrays.sort(arr,Collections.reverseOrder());
             // Arrays.sort(arr,0,3,Collections.reverseOrder());

        print(arr);
    }
}
// Added code of Inbuilt sorting 
// Collections required objects so replaced int --> Integer
