package DAY6;

//Java program with Optional Class

import java.util.Optional;

//Driver Class
public class Optional2 {
   // Main Method
 public static void main(String[] args)
 {
     String[] words = new String[10];
     
       Optional<String> checkNull = Optional.ofNullable(words[5]);
     
       if (checkNull.isPresent()) {
         String word = words[5].toLowerCase();
         System.out.print(word);
     }
     else
         System.out.println("word is null");
 }
}
