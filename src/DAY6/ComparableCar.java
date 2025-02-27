package DAY6;

import java.util.*;  

class Car implements Comparable<Car> {  
    int modelNumber;  
    String brand;  
    int topSpeed;  

    Car(int modelNumber, String brand, int topSpeed) {  
        this.modelNumber = modelNumber;  
        this.brand = brand;  
        this.topSpeed = topSpeed;  
    }  

    public int compareTo(Car c) {  
        return Integer.compare(this.topSpeed, c.topSpeed);  
    }  
}  

public class ComparableCar {  
    public static void main(String args[]) {  
        ArrayList<Car> cars = new ArrayList<>();  
        cars.add(new Car(101, "Ferrari", 350));  
        cars.add(new Car(104, "Lamborghini", 340));  
        cars.add(new Car(103, "Bugatti", 380));  

        Collections.sort(cars);  
        for (Car c : cars) {  
            System.out.println(c.modelNumber + " " + c.brand + " " + c.topSpeed);  
        }  
    }  
}  

