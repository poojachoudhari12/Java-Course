//Class with Data Members but No Methods
class Point {
    int x, y; // Two data members representing coordinates
}
public class Demonstration_31 {
    public static void main(String[] args) {
        Point p = new Point(); // Create an object 'p' of class Point
        p.x = 10; // Manually initialize x and y from the main program
        p.y = 10;

        System.out.println("x: " + p.x + ", y: " + p.y); // Output: x: 10, y: 10
    }
}
