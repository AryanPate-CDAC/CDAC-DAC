// Superclass
class Vehicle {
    protected String brand;
    protected int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
}

// Car subclass
class Car extends Vehicle {
    private String modelType;

    Car(String brand, int speed, String modelType) {
        super(brand, speed);
        this.modelType = modelType;
    }

    void display() {
        System.out.println("Car → " + brand + " " + modelType + ", Speed=" + speed);
    }
}

// Bike subclass
class Bike extends Vehicle {
    private String modelType;

    Bike(String brand, int speed, String modelType) {
        super(brand, speed);
        this.modelType = modelType;
    }

    void display() {
        System.out.println("Bike → " + brand + " " + modelType + ", Speed=" + speed);
    }
}

// Main class
public class VehicleType {
    public static void main(String[] args) {
        Car car = new Car("Honda", 180, "Civic");
        Bike bike = new Bike("Yamaha", 120, "R15");

        car.display();
        bike.display();
    }
}
