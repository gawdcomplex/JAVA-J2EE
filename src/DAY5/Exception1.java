package DAY5;

public class Exception1 {

    public static void main(String[] args) {
        Exception1 t = new Exception1();
        try {
            t.check();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero is not allowed.");
        }
    }

    void check() throws InterruptedException {
        Thread.sleep(4000); // Checked Exception

        try {
            int i = 9 / 0; // Unchecked Exception
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        System.out.println("Working?");
    }
}
