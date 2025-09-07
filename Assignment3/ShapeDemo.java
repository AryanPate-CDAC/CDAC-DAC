// Superclass
abstract class Shape {
    abstract double area();  // method stub (no body)
}

// Rectangle subclass
class Rectangle extends Shape {
    private double length;
    private double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }
}

// Circle subclass
class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Main class
public class ShapeDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        Circle cir = new Circle(7);

        System.out.println("Rectangle Area = " + rect.area());
        System.out.printf("Circle Area = %.2f%n", cir.area());
    }
}
