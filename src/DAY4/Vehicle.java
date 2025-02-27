package DAY4;

class Vehicledrive { 
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

class Car extends Vehicledrive {
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}

class Vehicle { 
    public static void main(String[] args) {
        Vehicledrive myCar = new Car();
        myCar.drive();  // Output: Repairing a car
    }
}
