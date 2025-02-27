package DAY5;

public class exhandexamp2 {
	    public static void main(String[] args) {
	        try {
	            int[] numbers = {1, 2, 3};
	            // Accessing an index that does not exist
	            System.out.println(numbers[5]); 
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: Array index is out of bounds!");
	        }

	        System.out.println("Program continues after exception handling.");
	    }

}
