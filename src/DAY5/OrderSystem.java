package DAY5;

// Exception Class
class OrderValueTooLowException extends Exception {
 public OrderValueTooLowException(String message) {
     super(message);
 }
}

public class OrderSystem {
 private static final double MIN_ORDER_VALUE = 100.0; // Minimum order requirement

 public static void placeOrder(double orderValue) throws OrderValueTooLowException {
     if (orderValue < MIN_ORDER_VALUE) {
         throw new OrderValueTooLowException("Order value too low! Minimum order must be $" + MIN_ORDER_VALUE);
     }
     System.out.println("Order placed successfully! Order Value: $" + orderValue);
 }

 public static void main(String[] args) {
     try {
         placeOrder(50); 
     } catch (OrderValueTooLowException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}
