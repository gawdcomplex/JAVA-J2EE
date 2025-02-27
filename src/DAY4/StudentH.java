package DAY4;

import java.util.Scanner;

// Base class (Renamed to avoid conflict)
class StudentDetails {
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

// Derived class 1
class MPCMarks extends StudentDetails {
    int mathsMarks, physicsMarks, chemistryMarks;

    void readMPCMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Maths Marks: ");
        mathsMarks = sc.nextInt();
        System.out.print("Enter Physics Marks: ");
        physicsMarks = sc.nextInt();
        System.out.print("Enter Chemistry Marks: ");
        chemistryMarks = sc.nextInt();
    }

    void displayMPCMarks() {
        displayDetails();
        System.out.println("\nMPC Marks:");
        System.out.println("Maths: " + mathsMarks);
        System.out.println("Physics: " + physicsMarks);
        System.out.println("Chemistry: " + chemistryMarks);
    }
}

// Derived class 2
class CECMarks extends StudentDetails {
    int commerceMarks, economicsMarks, civicsMarks;

    void readCECMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Commerce Marks: ");
        commerceMarks = sc.nextInt();
        System.out.print("Enter Economics Marks: ");
        economicsMarks = sc.nextInt();
        System.out.print("Enter Civics Marks: ");
        civicsMarks = sc.nextInt();
    }

    void displayCECMarks() {
        displayDetails();
        System.out.println("\nCEC Marks:");
        System.out.println("Commerce: " + commerceMarks);
        System.out.println("Economics: " + economicsMarks);
        System.out.println("Civics: " + civicsMarks);
    }
}

// Main class (Filename: StudentH.java)
public class StudentH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 for MPC, 2 for CEC: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            MPCMarks student = new MPCMarks();
            student.readDetails();
            student.readMPCMarks();
            student.displayMPCMarks();
        } else if (choice == 2) {
            CECMarks student = new CECMarks();
            student.readDetails();
            student.readCECMarks();
            student.displayCECMarks();
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
