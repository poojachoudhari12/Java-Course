class Point {
    int x, y; // Data members

    // Method to initialize with parameters
    void setPoint(int a, int b) {
        x = a;
        y = b;
    }
}

public class Demonstration_36 {
    public static void main(String[] args) {
        Point p1 = new Point(); // Create first object
        Point p2 = new Point(); // Create second object

        p1.setPoint(15, 20); // Initialize p1 with values 15 and 20
        p2.setPoint(0, 0);   // Initialize p2 with values 0 and 0

        // Print values for both objects
        System.out.println("p1 -> x: " + p1.x + ", y: " + p1.y); // Output: p1 -> x: 15, y: 20
        System.out.println("p2 -> x: " + p2.x + ", y: " + p2.y); // Output: p2 -> x: 0, y: 0
    }
}
