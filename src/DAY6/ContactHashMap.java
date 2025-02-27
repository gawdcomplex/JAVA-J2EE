package DAY6;

import java.util.*;

class PersonContact {
    private String name;
    private String phoneNumber;

    public PersonContact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return name + " - " + phoneNumber;
    }
}

public class ContactHashMap {
    private HashMap<String, List<PersonContact>> contacts;

    // Constructor
    public ContactHashMap() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.putIfAbsent(name, new ArrayList<>());
        contacts.get(name).add(new PersonContact(name, phoneNumber));
    }

    public void displayContacts() {
        for (List<PersonContact> contactList : contacts.values()) {
            for (PersonContact contact : contactList) {
                System.out.println(contact);
            }
        }
    }

    // Method to search for a contact 
    public void searchContact(String name) {
        if (contacts.containsKey(name)) {
            for (PersonContact contact : contacts.get(name)) {
                System.out.println(contact);
            }
        } else {
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			ContactHashMap contactList = new ContactHashMap();


			contactList.addContact("David", "9876543210");
			contactList.addContact("James", "9988776655");
			contactList.addContact("Rahul", "9123456789");
			contactList.addContact("Joy", "8765432109");
			contactList.addContact("Dale", "9456781230");


			contactList.displayContacts();

			while (true) {
			    String searchName = scanner.nextLine();
			    contactList.searchContact(searchName);
			}
		}
    }
}
