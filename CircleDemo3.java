class Circle {
    private double x; // X-coordinate of the circle's center
    private double y; // Y-coordinate of the circle's center
    private double radius; // Radius of the circle

    // Method to set values
    public void setCircle(double a, double b, double c) {
        x = a; // Assign a to x
        y = b; // Assign b to y
        radius = c; // Assign c to radius
        System.out.println("The value of x : "+x);
        System.out.println("The value of y: "+y);
        System.out.println("The value of radius: "+radius);
    }
}
public class CircleDemo3 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();


        c1.setCircle(3.0, 4.0, 5.0); // Initializing c1
        c2.setCircle(-4.0, 8.0, 10.0); // Initializing c2

    }
}
