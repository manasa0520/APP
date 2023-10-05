package Week6;
public class Shape {
    protected double side_010;
    public Shape(double side_010) {
        this.side_010 = side_010;
    }
    public double getPerimeter() {
        return 0.0; // Default implementation, to be overridden by subclasses
    }
    public double getArea() {
        return 0.0; // Default implementation, to be overridden by subclasses
    }
}
class Circle extends Shape {
    private static final double PI = 3.14159265359;
    public Circle(double radius_010) {
        super(radius_010);
    }
    @Override
    public double getPerimeter() {
        return 2 * PI * side_010;
    }
    @Override
    public double getArea() {
        return PI * side_010 * side_010;
    }
    public static void main(String[] args) {
        Circle circle = new Circle(5.0); // Creating a circle with radius 5.0
        double perimeter = circle.getPerimeter();
        double area = circle.getArea();
        System.out.println("Circle Perimeter: " + perimeter);
        System.out.println("Circle Area: " + area);
    }
}
