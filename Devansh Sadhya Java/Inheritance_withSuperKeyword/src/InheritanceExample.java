// Parent class
class Animal {
    String name = "Animal";

    // Constructor
    Animal() {
        System.out.println("Animal constructor called");
    }

    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Child class
class Dog extends Animal {
    String name = "Dog";

    // Constructor
    Dog() {
        // Calling parent class constructor
        super();
        System.out.println("Dog constructor called");
    }

    void display() {
        // Accessing parent class variable
        System.out.println("Parent name: " + super.name);
        // Accessing child class variable
        System.out.println("Child name: " + name);
    }

    // Overriding parent method
    void sound() {
        // Calling parent method using super
        super.sound();
        System.out.println("Dogs bark");
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
        d.sound();
    }
}
