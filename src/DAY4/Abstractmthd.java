package DAY4;

abstract class Animals {
    // Abstract method (does not have a body)
    public abstract void makesSound();

    // Concrete method
    public void sleeps() {
        System.out.println("Zzz");
    }
}

class Dog extends Animals {
    // Implementing abstract method
    public void makesSound() {
        System.out.println("Woof");
    }
}

class Cats extends Animals {
    // Implementing abstract method
    public void makesSound() {
        System.out.println("Meow");
    }
}

public class Abstractmthd {
    public static void main(String[] args) {
        Animals dog = new Dog();
        Animals cat = new Cats();

        dog.makesSound(); // Output: Woof
        cat.makesSound(); // Output: Meow

        dog.sleeps(); // Output: Zzz
        cat.sleeps(); // Output: Zzz
    }
}