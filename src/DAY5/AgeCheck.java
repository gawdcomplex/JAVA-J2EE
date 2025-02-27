package DAY5;

//Custom Exception
class InvalidAgeException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public InvalidAgeException(String message) {
     super(message);
 }
}

public class AgeCheck {
 public static void main(String[] args) {
     try {
         checkAge(-3); // negative age
     } catch (InvalidAgeException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }

 // to check age
 static void checkAge(int age) throws InvalidAgeException {
     if (age < 0) { //condition to check
         throw new InvalidAgeException("Age cannot be negative!");
     }
     System.out.println("Valid age: " + age);
 }
}
