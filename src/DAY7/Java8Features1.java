package DAY7;

import java.util.ArrayList;
import java.util.List;

public class Java8Features1 {
    public static void main(String[] args) {
       
        HotelStaff staff1 = new HotelStaff(101, "Abhi", 50000);
        HotelStaff staff2 = new HotelStaff(102, "Raghav", 45000);
        HotelStaff staff3 = new HotelStaff(103, "Utk", 55000);
        HotelStaff staff4 = new HotelStaff(104, "Dev", 40000);

        
        List<HotelStaff> list = new ArrayList<>();
        list.add(staff1);
        list.add(staff2);
        list.add(staff3);
        list.add(staff4);

        
        List<String> newList = list.stream()
                .filter(x -> x.getSalary() > 45000) // Filter by salary
                .map(HotelStaff::getName) // Extract names
                .sorted() // Sort alphabetically
                .toList(); 

        System.out.println("Hotel Staff with Salary > 45000: " + newList);
    }
}

class HotelStaff {
    private int id;
    private String name;
    private double salary;

    public HotelStaff(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

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
