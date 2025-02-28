package DAY7;
import java.io.*;
import java.util.Scanner;

public class AddressStorage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "address.txt";

      
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        // Writing to a file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Name: " + name + "\n");
            writer.write("Address: " + address + "\n");
            System.out.println("Address stored successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e);
        }

        // Reading from the file
        System.out.println("\nReading stored address...");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e);
        }

        scanner.close();
    }
}
