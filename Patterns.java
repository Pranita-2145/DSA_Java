package DSA_Java;

public class Patterns {
    public static void main(String[] args) {
        //Star Pattern
        /*for(int i=0; i<=4; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
            */

            //Inverted Stars
            int n=4;
            for(int line=1; line<=n; line++){
                for(int star=1; star<=n-line+1; star++){
                    System.out.print("*");

                }
                System.out.println();
            }
    }
}
