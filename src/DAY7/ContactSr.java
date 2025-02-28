package DAY7;

import java.io.*;

//Contact class implementing Serializable
class Contact implements Serializable {
 private static final long serialVersionUID = 1L; 
 String name;
 String phoneNumber;
 transient String email; // Will NOT be serialized

 public Contact(String name, String phoneNumber, String email) {
     this.name = name;
     this.phoneNumber = phoneNumber;
     this.email = email;
 }

 @Override
 public String toString() {
     return "Name: " + name + ", Phone: " + phoneNumber + ", Email: " + email;
 }
}

public class ContactSr {
 public static void main(String[] args) {
     Contact contact = new Contact("John Doe", "9876543210", "john@example.com");

     // Serialization
     try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("contact.ser"))) {
         out.writeObject(contact);
         System.out.println("Contact serialized successfully!");
     } catch (IOException e) {
         System.out.println("Serialization Error: " + e);
     }

     // Deserialization
     try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("contact.ser"))) {
         Contact deserializedContact = (Contact) in.readObject();
         System.out.println("Deserialized Contact: " + deserializedContact);
     } catch (IOException | ClassNotFoundException e) {
         System.out.println("Deserialization Error: " + e);
     }
 }
}
