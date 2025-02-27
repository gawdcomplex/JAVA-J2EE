package Day5prac;
public class CommonElements {
    public static void main(String[] args) {
        String[] array1 = {"Apple", "Banana", "Orange", "Mango", "Grapes"};
        String[] array2 = {"Mango", "Peach", "Apple", "Cherry", "Grapes"};

        System.out.print("Common Elements: ");
        for (String item1 : array1) {
            for (String item2 : array2) {
                if (item1.equals(item2)) {
                    System.out.print(item1 + " ");
                }
            }
        }
    }
}

