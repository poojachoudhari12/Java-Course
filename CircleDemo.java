class Circle {
    private double x, y, radius;

    // Constructor with three parameters
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Constructor with one parameter (radius only)
    public Circle(double radius) {
        this.x = 0; // Default value
        this.y = 0; // Default value
        this.radius = radius;
    }

    // Default constructor
    public Circle() {
        this.x = 0; // Default value
        this.y = 0; // Default value
        this.radius = 1; // Default radius
    }
}
public class CircleDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle(3.0, 4.0, 5.0); // Using first constructor
        Circle c2 = new Circle(10.0); // Using second constructor
        Circle c3 = new Circle(); // Using default constructor
    }
}
