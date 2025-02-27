package DAY5;

class MarksNotValidException extends Exception {
    public MarksNotValidException(String message) {
        super(message);
    }
}

public class MarksValidation {
    public static void main(String[] args) {
        try {
            validateMarks(-5); // Testing with invalid marks
        } catch (MarksNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    static void validateMarks(int marks) throws MarksNotValidException {
        if (marks < 0) {
            throw new MarksNotValidException("Marks cannot be negative.");
        }
        System.out.println("Marks entered: " + marks);
    }
}