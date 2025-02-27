package DAY6;

import java.util.Optional;

public class Optional1 {
 public static void main (String[]args) {
	 String name = " Sparsh";
	 
	 Optional<String> obj = Optional.ofNullable(name);
	  if (obj.isPresent()) {
		  System.out.println("String is not empty" + obj.get());
	  }
	  else {
		  System.out.println("String is empty  ");
	  }
 }
}
