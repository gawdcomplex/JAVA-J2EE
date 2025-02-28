package DAY7;

import java.util.ArrayList;
import java.util.List;

public class Java8Features2 {
    public static void main(String[] args) {
        // Creating HotelStaff objects
        HotelStaff staff1 = new HotelStaff(101, "Sam", 50000);
        HotelStaff staff2 = new HotelStaff(102, "Alice", 45000);
        HotelStaff staff3 = new HotelStaff(103, "Steve", 55000);
        HotelStaff staff4 = new HotelStaff(104, "Sophia", 40000);

        List<HotelStaff> list = new ArrayList<>();
        list.add(staff1);
        list.add(staff2);
        list.add(staff3);
        list.add(staff4);

        
        List<String> newList = list.stream()
                .filter(x -> x.getName().startsWith("S")) // Filter names starting with S
                .map(x -> x.getName().toUpperCase()) 
                .sorted() 
                .toList(); 

        System.out.println("Hotel Staff names starting with 'S' (Uppercase & Sorted): " + newList);
    }
}


class HotelStaff2 {
    private int id;
    private String name;
    private double salary;

    public HotelStaff2(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
