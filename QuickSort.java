package DSA_Java;

public class QuickSort {

    public static void quicksort(int arr[], int low, int high){
        if(low<high){
            int partIndex = partition(arr, low, high);
            quicksort(arr, low, partIndex-1);
            quicksort(arr, partIndex+1, high);
        }
    }

    public static int partition(int arr[], int low, int high){
        int pivot = arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(i<=high && arr[i]<=pivot){
                i++;
            }
            while(j>=low && arr[j]> pivot){
                j--;
            }
            if(i<j){
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }
    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 6, 3, 1, 5};
        quicksort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");

    }
}
}

