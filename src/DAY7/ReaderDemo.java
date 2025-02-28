package DAY7;

import java.io.*;

public class ReaderDemo {

    public static void main(String[] args) {
        File file = new File("myfile2.txt"); // Change extension if needed

        try {
            // Create the file if it does not exist
            if (!file.exists()) {
                FileWriter writer = new FileWriter(file);
                writer.write("Hello, this is a test file!\nWelcome to File Handling in Java.");
                writer.close();
                System.out.println("File created and some text added.");
            }

            // Read the file
            Reader obj = new FileReader(file);
            int i = obj.read();
            while (i != -1) {
                System.out.print((char) i);
                i = obj.read();
            }
            obj.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found! Make sure 'myfile2.txt' exists.");
        } catch (IOException e) {
            System.out.println("Error reading or writing the file: " + e);
        }
    }
}
