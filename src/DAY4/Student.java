package DAY4;

import java.util.Scanner;

// Base class 
class Studentmarks {
    int studentID;
    String studentName;
    String phone;

    void readDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        studentID = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();
        System.out.print("Enter Phone Number: ");
        phone = sc.nextLine();
    }

    void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("ID: " + studentID);
        System.out.println("Name: " + studentName);
        System.out.println("Phone: " + phone);
    }
}

// Derived class
class Marks extends Studentmarks {
    int M1, M2, M3;

    void readMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks 1: ");
        M1 = sc.nextInt();
        System.out.print("Enter Marks 2: ");
        M2 = sc.nextInt();
        System.out.print("Enter Marks 3: ");
        M3 = sc.nextInt();
    }

    void displayMarks() {
        System.out.println("\nMarks Details:");
        System.out.println("M1: " + M1);
        System.out.println("M2: " + M2);
        System.out.println("M3: " + M3);
    }
}

// Main class
public class Student {
    public static void main(String[] args) {
        Marks student = new Marks(); // Instance of the most derived class
        student.readDetails();
        student.readMarks();
        student.displayDetails();
        student.displayMarks();
    }
}
