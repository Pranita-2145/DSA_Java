package DSA_Java;
import java.util.*;
public class TwoDarrays {
    // Finding largest element
    public static int largest(int matrix[][]){
        int large = Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
               large = Math.max(large, matrix[i][j]);
            }
        }
        return large;
    }


    // Finding smallest element 
     public static int smallest(int matrix[][]){
        int small = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
               small = Math.min(small, matrix[i][j]);
            }
        }
        return small;
    }
    // Finding an element
public static boolean search(int matrix[][], int key){
    for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
            if(matrix[i][j] == key){
                System.out.println("Element found at cell" + "(" + i + "," + j + ")");
                return true;
            }
        }
    }
    System.out.println("Elemnt not found");
    return false;
}
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[] [] = new int[3] [3];
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //Output
        System.out.println("Your matrix is :");

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        search(matrix, 5);
       System.out.println("The largest Element is"+largest(matrix));
        System.out.println("The smallest Element is"+smallest(matrix));

     }
}