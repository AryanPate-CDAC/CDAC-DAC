// Superclass
class Animal {
    void makeSound() {
        System.out.println("Some sound...");
    }
}

// Dog subclass
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog → Bark");
    }
}

// Cat subclass
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat → Meow");
    }
}

// Main class
public class AnimalSound {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}
