import java.io.*;

public class DataInputStreamExample2 {
    public static void main(String[] args) {
        DataInputStream in = new DataInputStream(System.in);
        try {
            System.out.print("Enter principal amount: ");
            float principal = Float.parseFloat(in.readLine());
            
            System.out.print("Enter rate of interest: ");
            float rate = Float.parseFloat(in.readLine());
            
            System.out.print("Enter number of years: ");
            int years = Integer.parseInt(in.readLine());
            
            float interest = (principal * rate * years) / 100;
            System.out.println("The calculated interest is: " + interest);
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        }
    }
}
