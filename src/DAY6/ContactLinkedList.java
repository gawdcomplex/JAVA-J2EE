package DAY6;

import java.util.LinkedList;
import java.util.List;

class LinkedContact {

    String name;
    String phoneNumber;
    boolean isFavourite;

    LinkedContact(String name, String phoneNumber, boolean isFavourite) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.isFavourite = isFavourite;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Ph No : " + phoneNumber);
        System.out.println("Favourite : " + (isFavourite ? "Yes" : "NO"));
        System.out.println("------------------");
    }
}

public class ContactLinkedList {
    public static void main(String[] args) {
        List<LinkedContact> contactLinkedList = new LinkedList<>();
        contactLinkedList.add(new LinkedContact("XYZ", "1234567890", true));
        contactLinkedList.add(new LinkedContact("ABC", "9876543210", false));

        for (LinkedContact contact : contactLinkedList) {
            contact.display();
        }
    }
}
