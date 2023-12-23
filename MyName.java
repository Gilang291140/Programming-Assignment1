package Assignmnet1;
import java.util.Scanner;

public class MyName  {

   public static void main(String[] args){
   
      Scanner scan = new Scanner(System.in);
      StringBuilder result = new StringBuilder();
   
      System.out.print("Please enter your full name: ");
      String name = scan.nextLine(); 
      
      // ? Kita nge split katanya kalo ada " "
      String[] words = name.split(" ");

      for (int i = 0; i < words.length; i++) {
      
         String word = words[i];

      }
      
      int vowels = 0;
      int consonants = 0;
      
      // ?  Ini ngebuat semua huruf jadi ga kapital contoh
      // ?  MUhammad Haikal Jadi muhammad haikal
      // ?  pAtRaA koNtOL
      // ?  patraa kontol
       
      String lowercasedWords = name.toLowerCase();
      // Test case
      // * System.out.println("Huruf yang udah di lowercase " + lowercasedWords);
      for (char c : lowercasedWords.toCharArray()) {
         if ("aeiou".indexOf(c) != -1) {
            vowels++;
         } else if (Character.isLetter(c)) {
            consonants++;
         }
      }
      
      int sumWords = vowels + consonants;
      // * words.length " " masuk

      System.out.println("Your initials are " + result);//print huruf pertama dalam kata tiap kalimat
      System.out.println("The length of your name is " + sumWords);//jumlah panjang nama
   
      System.out.println("The number of vowels in your name is " + vowels);
      System.out.println("The number of consonants in your name is " + consonants);
   }
}
 
