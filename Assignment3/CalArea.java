class ShapeArea {

    // Square
    int calculateArea(int side) {
        return side * side;
    }

    // Rectangle
    int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    // Circle
    double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }
}

// Main class
public class CalArea {
    public static void main(String[] args) {
        ShapeArea sa = new ShapeArea();

        System.out.println("Square Area = " + sa.calculateArea(5));
        System.out.println("Rectangle Area = " + sa.calculateArea(4, 6));
        System.out.println("Circle Area = " + sa.calculateArea(3.0));
    }
}
