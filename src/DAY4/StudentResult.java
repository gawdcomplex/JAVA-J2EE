package DAY4;

import java.util.Scanner;

// Base class
class StudentDts {
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

// Intermediate class (inherits Student)
class Marks2 extends StudentDts {
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
        displayDetails();
        System.out.println("\nMarks:");
        System.out.println("M1: " + M1);
        System.out.println("M2: " + M2);
        System.out.println("M3: " + M3);
    }
}

// Most derived class (inherits Marks)
class Result extends Marks2 {
    int totalMarks;
    double percentage;
    String grade;

    void calculateResult() {
        totalMarks = M1 + M2 + M3;
        percentage = totalMarks / 3.0;

        // Determine grade based on percentage
        if (percentage >= 75) {
            grade = "First Class";
        } else if (percentage >= 60) {
            grade = "Second Class";
        } else if (percentage >= 50) {
            grade = "Third Class";
        } else {
            grade = "Fail";
        }
    }

    void displayResult() {
        displayMarks();
        System.out.println("\nResult:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}

// Main class (should match filename)
public class StudentResult {
    public static void main(String[] args) {
        Result student = new Result(); // Create object of most derived class
        student.readDetails();
        student.readMarks();
        student.calculateResult();
        student.displayResult();
    }
}
