//Copy Constructor (Passing Object as Parameter)
class Circle {
    double x, y, r;

    // Constructor with three parameters
    Circle(double a, double b, double c) {
        x = a;
        y = b;
        r = c;
    }

    // Copy constructor (object as parameter)
    Circle(Circle c)
    {
        x=c.x;
        y=c.y;
        r=c.r;
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

public class Demonstration_40 {
    public static void main(String[] args) {
        Circle c1 = new Circle(3.0, 4.0, 5.0); // Constructor with three parameters
        Circle c2=new Circle(c1); // Copy constructor           

        System.out.println("Circle 1 -> Circumference: " + c1.circumference() + ", Area: " + c1.area());
        System.out.println("Circle 2 -> Circumference: " + c2.circumference() + ", Area: " + c2.area());
    }
}
