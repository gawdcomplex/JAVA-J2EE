package DAY6;

import java.util.*;  

class Employee implements Comparable<Employee> {  
    int empId;  
    String name;  
    int age;  

    Employee(int empId, String name, int age) {  
        this.empId = empId;  
        this.name = name;  
        this.age = age;  
    }  

    public int compareTo(Employee emp) {  
        return Integer.compare(this.age, emp.age);
    }  
}  

public class Comparable1 {  
    public static void main(String args[]) {  
        ArrayList<Employee> employees = new ArrayList<>();  
        employees.add(new Employee(201, "Rohan", 30));  
        employees.add(new Employee(204, "Neha", 25));  
        employees.add(new Employee(203, "Amit", 28));  

        Collections.sort(employees);  
        for (Employee emp : employees) {  
            System.out.println(emp.empId + " " + emp.name + " " + emp.age);  
        }  
    }  
}  
