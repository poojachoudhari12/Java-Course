import java.util.Scanner;

public class MaximumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading two integers
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        
        // Finding the maximum
        int max = (a > b) ? a : b;
        System.out.println("The larger number is: " + max);
    }
}
