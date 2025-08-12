package DSA_Java;
import java.util.*;
class Stringbasics{
    
   /*  public static int vowel(String S1){
        int count =0;
        for(int i=0; i<S1.length(); i++){
            char ch = Character.toLowerCase(S1.charAt(i));
            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch =='u'){
                count++;
            }
          
        }
         return count;
    }
    */

    //Is Palindrome

    /*public static boolean isPalindrome(String str){
          for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
              return false;
            }
          }
          return true;
    }
          */

    // Shortest Path
    public static float getshortedtpath(String path){
        int x=0;
        int y=0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            if(dir == 'N'){
                y++;
            }
            else if(dir == 'S'){
                y--;
            }
            else if(dir == 'E'){
                x++;
            }
            else{
                y--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }      
public static void main(String[] args) {

  /*   //Create a String
    String str1 = new String("Pranita");
    String str2 = "Bhor";

    //String length
    System.out.println("The length of the string is" + str1.length());

    //Concatenate two strings
    String result = str1 + " " + str2;
    System.out.println(result);
    
    //Finding number of vowels
   int vowelcount = vowel(str1);
   if(vowelcount > 0){
    System.out.println("Number of vowels: " + vowelcount);

   }
   else{
    System.out.println("No vowels present");
   }
   */

  /* String str1 = "racecar";
   System.out.println(isPalindrome(str1));
   */

   String Path = "NS";
   System.out.println(getshortedtpath(Path));
}
}