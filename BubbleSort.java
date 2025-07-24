package DSA_Java;

public class BubbleSort {
    public static void bubble(int arr[]){
        for(int turns=0; turns<arr.length-1;turns++){
            for(int j=0; j<arr.length-1-turns; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                arr[j+1] = temp;                }
            }
        }
    }
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,2,1,4,3};
        bubble(arr);
        print(arr);
    }
}
