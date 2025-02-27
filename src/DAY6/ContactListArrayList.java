package DAY6;

import java.util.*;

class Contact {
 String name;
 String phoneNumber;
 boolean isFavourite;

 Contact(String name, String phoneNumber, boolean isFavourite) {
     this.name = name;
     this.phoneNumber = phoneNumber;
     this.isFavourite = isFavourite;
 }

 void display() {
     System.out.println("Name : " + name);
     System.out.println("Ph No : " + phoneNumber);
     System.out.println("Favourite : " + (isFavourite ? "Yes" : "Yes"));
     System.out.println("------------------");
 }
}

public class ContactListArrayList {
 public static void main(String[] args) {
     List<Contact> contactArrayList = new ArrayList<>();
     contactArrayList.add(new Contact("Virat Kohli", "1234567890", true));
     contactArrayList.add(new Contact("Rohit Sharma", "9876543210", false));
     
     for (Contact contact : contactArrayList) {
         contact.display();
     }
 }
}
