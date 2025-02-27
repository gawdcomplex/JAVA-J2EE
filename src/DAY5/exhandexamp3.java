package DAY5;

import java.util.Scanner;

public class exhandexamp3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt(); 
            System.out.println("You entered: " + number);
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a number.");
        }

        scanner.close();
    }
}

