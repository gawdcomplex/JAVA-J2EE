package DAY4;

class Shaperect { // The file name must be Shape.java
    double getArea() {
        return 0; // Default implementation
    }
}

class Rectangle extends Shaperect {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width; // Formula: length × width
    }
}

public class Shape { // The main method should be in a separate non-public class
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        System.out.println("Area of Rectangle: " + rect.getArea()); // Output: 50
    }
}

