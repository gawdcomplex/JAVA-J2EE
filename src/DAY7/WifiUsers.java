package DAY7;

import java.io.*;
import java.util.Scanner;

public class WifiUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "WifiUsers.txt";

       
        System.out.print("Enter User Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Device Name: ");
        String device = scanner.nextLine();

        System.out.print("Enter MAC Address: ");
        String macAddress = scanner.nextLine();

        // Writing 
        try (FileWriter writer = new FileWriter(fileName, true)) { 
            writer.write("User: " + name + "\n");
            writer.write("Device: " + device + "\n");
            writer.write("MAC Address: " + macAddress + "\n");
            writer.write("--------------------------\n");
            System.out.println("WiFi user details stored successfully!\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e);
        }

        // Reading 
        System.out.println("Displaying WiFi Users Details:");
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
