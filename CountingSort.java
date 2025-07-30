package DSA_Java;

public class CountingSort {
    public static void Counting(int arr[]){
        //Find the range
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1]; //Created arrray of size of range
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++; //Calculate occurance of one number
        }

        int j=0;
        for(int i=0; i<count.length;i++){
            while(count[i] >0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

     public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2 ,4, 2, 3, 7};
        Counting(arr);
        print(arr);
    }
}
