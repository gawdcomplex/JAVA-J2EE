package DAY5;

import java.util.ArrayList;

// Custom Exception Class
class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}

public class UserSearch {
    public static void main(String[] args) {
        // Creating a list of users
        ArrayList<String> users = new ArrayList<>();
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");

        // Searching for a user
        try {
            findUser(users, "David"); // Searching for "David", who is not in the list
        } catch (UserNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to find a user in the list
    static void findUser(ArrayList<String> users, String searchUser) throws UserNotFoundException {
        if (!users.contains(searchUser)) {
            throw new UserNotFoundException("User '" + searchUser + "' not found in the list.");
        }
        System.out.println("User '" + searchUser + "' found in the list.");
    }
}
