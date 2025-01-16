/*
 * Author: Carson Lam
 */


import java.util.*;
public class Main {
    
   public static void main(String args[]){
       
      //Initialize counters, classes, and user input
       
      Scanner sc = new Scanner(System.in);      
      int vowelCount = 0;
      String sentence = sc.nextLine();

      //Iterate through sentence with for loop and compare each character to vowel
      //Check for both capital and lowercase

      for (int i = 0 ; i < sentence.length(); i++) {
         char ch = sentence.charAt(i);
             if(ch == 'a'|| ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u') {
            vowelCount += 1;
         } else if (ch == 'A'|| ch == 'E'|| ch == 'I' || ch == 'O' || ch == 'U') {
            vowelCount += 1;
         }
      }
      
      System.out.println(vowelCount);
   }
}