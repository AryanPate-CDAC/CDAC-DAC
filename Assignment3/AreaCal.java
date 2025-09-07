import java.util.Scanner;

interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle implements Shape {
    double length, breadth;
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double calculateArea() {
        return length * breadth;
    }
}

class Square implements Shape {
    double side;
    Square(double side) {
        this.side = side;
    }
    public double calculateArea() {
        return side * side;
    }
}

public class AreaCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of Circle: ");
        double r = sc.nextDouble();
        System.out.print("Enter length of Rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth of Rectangle: ");
        double b = sc.nextDouble();
        System.out.print("Enter side of Square: ");
        double s = sc.nextDouble();

        Circle c = new Circle(r);
        Rectangle rec = new Rectangle(l, b);
        Square sq = new Square(s);

        System.out.println("Circle Area = " + c.calculateArea());
        System.out.println("Rectangle Area = " + rec.calculateArea());
        System.out.println("Square Area = " + sq.calculateArea());
    }
}
