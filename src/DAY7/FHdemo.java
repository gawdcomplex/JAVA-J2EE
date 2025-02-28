package DAY7;

import java.io.File;
import java.io.IOException;

public class FHdemo {

    public static void main(String[] args) {
        File obj = new File("myfile2.txt");

        try {
            // Create the file if it doesn't exist
            if (obj.createNewFile()) {
                System.out.println("File created: " + obj.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Attempt to delete the file
            if (obj.delete()) {
                System.out.println("File deleted successfully!");
            } else {
                System.out.println("Failed to delete the file.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}
