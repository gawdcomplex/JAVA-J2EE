package DAY6;

// Java program to illustrate Optional class methods

import java.util.Optional;

public class Optional3 {
    // Driver code
    public static void main(String[] args) {
        // Creating a string array
        String[] str = new String[5];

        // Setting value for 2nd index
        str[2] = "IPL is coming soon";

        // It returns an empty instance of Optional class
        Optional<String> empty = Optional.empty();
        System.out.println("Empty Optional: " + empty);

        // It safely returns an Optional, avoiding NullPointerException
        Optional<String> value = Optional.ofNullable(str[2]);

        // Checking if a value is present before printing
        value.ifPresentOrElse(
            System.out::println, 
            () -> System.out.println("Value is not present")
        );
    }
}
