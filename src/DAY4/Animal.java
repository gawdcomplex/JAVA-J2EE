package DAY4; 

// Parent class
class AnimalSound {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass extending AnimalSound
class Cat extends AnimalSound {
    @Override
    void makeSound() {
        System.out.println("bark!");
    }
}

public class Animal { 
    public static void main(String[] args) {
        AnimalSound myAnimal = new AnimalSound();
        myAnimal.makeSound(); 

        Cat myCat = new Cat();
        myCat.makeSound(); 
    }
}
