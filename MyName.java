package Assignmnet1;
import java.util.Scanner;

public class MyName  {

   public static void main(String[] args){
   
      Scanner scan = new Scanner(System.in);
      StringBuilder result = new StringBuilder();
   
      System.out.print("Please enter your full name: ");
      String name = scan.nextLine(); 
      
      for (String word : name.split("\\s+")) {
         if (!word.isEmpty()) {
             result.append(word.charAt(0));
         }
     }

      
      int vowels = 0;
      int consonants = 0;
       
      String lowercasedWords = name.toLowerCase();
     
      for (char c : lowercasedWords.toCharArray()) {
         if ("aeiou".indexOf(c) != -1) {
            vowels++;
         } else if (Character.isLetter(c)) {
            consonants++;
         }
      }
      
      int sumWords = vowels + consonants;
      // * words.length " " tidak masuk

      System.out.println("Your initials are " + result);
      System.out.println("The length of your name is " + sumWords);
   
      System.out.println("The number of vowels in your name is " + vowels);
      System.out.println("The number of consonants in your name is " + consonants);
   }
}
 
