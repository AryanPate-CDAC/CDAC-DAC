// Abstract class
abstract class Shape {
    abstract void draw();
}

// Circle subclass
class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle of radius " + radius);
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void draw() {
        System.out.println("Drawing Rectangle of length " + length + " and breadth " + breadth);
    }
}

// Main class
public class ShapeDraw {
    public static void main(String[] args) {
        Shape s1 = new Circle(7);
        Shape s2 = new Rectangle(5, 10);

        s1.draw();
        s2.draw();
    }
}
