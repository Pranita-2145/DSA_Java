//package DSA_Java;


class RecursionBasics{

    // Print in Decreasing order
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        printDec(n-1);
    }
    //Factorial 
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fn = n * fnm1;
        return fn;
    }
    //Sum of n integers
    public static int CalSum(int n){
        if(n==1){
            return 1;
        }
        int snm1 = CalSum(n-1);
        int sum = n + snm1;
        return sum;
    }
    // Calculate nth fibonacci
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
       int fibnm1 = fib(n-1);
       int  fibnm2 = fib(n-2);
       int fibn = fibnm1 + fibnm2;
       return fibn;
    }
    //Sorted Array 
    public static boolean isSorted(int []arr, int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
       return  isSorted(arr, i+1);
    }
    //First Occurence
    public static int FirstOccur(int[] arr,  int key, int i){
        if(i==arr.length -1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return FirstOccur(arr, key, i + 1);
    }
    public static void main(String[] args) {
       int ans = fib(25);
       int arr[] = {1,3,4, 2,4};
        System.out.println(FirstOccur(arr, 4, 0));
    }
}