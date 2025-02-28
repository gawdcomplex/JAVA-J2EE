package DAY7;

import java.io.*;

// Serializable class
class Student3 implements Serializable {
    private static final long serialVersionUID = 1L; // Recommended for serialization
    String name;
    int age;

    public Student3() {
        this.name = "John Doe";
        this.age = 20;
    }

    @Override
    public String toString() {
        return "Student3{name='" + name + "', age=" + age + "}";
    }
}

public class IOstreamDemo {

    public static void main(String[] args) {
        try {
            Student3 s1 = new Student3(); // Create object
            // Create a stream and serialize object
            FileOutputStream fout = new FileOutputStream("demo.ser");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            out.close();
            System.out.println("Object is serialized");
        } catch (Exception e) {
            System.out.println("Serialization error: " + e);
        }

        System.out.println("Deserialization");
        // Deserialization
        try {
            FileInputStream fin = new FileInputStream("demo.ser");
            ObjectInputStream oin = new ObjectInputStream(fin);
            Student3 obj = (Student3) oin.readObject();
            oin.close();
            System.out.println("Deserialized Object: " + obj);
        } catch (Exception e) {
            System.out.println("Deserialization error: " + e);
        }
    }
}
