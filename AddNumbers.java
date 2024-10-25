//Example Using Command-Line Arguments with Integer Parsing
public class AddNumbers {
    public static void main(String[] args) {
        // Convert strings to integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        
        // Perform addition
        int sum = num1 + num2;
        
        // Print the result
        System.out.println("Sum: " + sum);
    }
}
