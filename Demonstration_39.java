class Circle {
    double x, y, r;

    // Constructor with three parameters
    Circle(double a, double b, double c) {
        x = a;
        y = b;
        r = c;
    }

    // Overloaded constructor with one parameter
    Circle(double c) {
        x = 0;
        y = 0;
        r = c;
    }

    // Overloaded constructor with no parameters (default constructor)
    Circle() {
        x = 0;
        y = 0;
        r = 1;
    }

    // Method to calculate the circumference
    double circumference() {
        return 2 * 3.1416 * r;
    }

    // Method to calculate the area
    double area() {
        return 3.1416 * r * r;
    }
}

public class Demonstration_39 {
    public static void main(String[] args) {
        Circle c1 = new Circle(3.0, 4.0, 5.0); // Constructor with three parameters
        Circle c2 = new Circle(5.0);           // Constructor with one parameter
        Circle c3 = new Circle();              // Default constructor (no parameters)

        System.out.println("Circle 1 -> Circumference: " + c1.circumference() + ", Area: " + c1.area());
        System.out.println("Circle 2 -> Circumference: " + c2.circumference() + ", Area: " + c2.area());
        System.out.println("Circle 3 -> Circumference: " + c3.circumference() + ", Area: " + c3.area());
    }
}
