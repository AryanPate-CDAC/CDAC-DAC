// Base class
class Vehicle {
    void displaySpeed() {
        System.out.println("Vehicle speed unknown");
    }
}

// Subclass Car
class Car extends Vehicle {
    @Override
    void displaySpeed() {
        System.out.println("Car speed 120 km/h");
    }
}

// Subclass Bike
class Bike extends Vehicle {
    @Override
    void displaySpeed() {
        System.out.println("Bike speed 80 km/h");
    }
}

// Main class
public class SpeedDisplay  {
    public static void main(String[] args) {
        Vehicle v1 = new Car();   // polymorphism
        Vehicle v2 = new Bike();  // polymorphism

        v1.displaySpeed();
        v2.displaySpeed();
    }
}
