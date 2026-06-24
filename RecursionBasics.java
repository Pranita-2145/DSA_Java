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
    public static void main(String[] args) {
       int ans = fib(25);
        System.out.println(ans);
    }
}