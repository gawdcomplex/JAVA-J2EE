package Day5prac;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        // Numeric array
        int[] numbers = {5, 2, 9, 1, 7, 8};
        // String array
        String[] words = {"Bread", "Apple", "Owl", "Man", "Ground"};

        // Sorting the arrays
        Arrays.sort(numbers);
        Arrays.sort(words);

        // Printing sorted numeric array
        System.out.println("Sorted Numeric Array: " + Arrays.toString(numbers));
        
        // Printing sorted string array
        System.out.println("Sorted String Array: " + Arrays.toString(words));
    }
}
