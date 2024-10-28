import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamExample {
    public static void main(String[] args) throws IOException {
        DataInputStream input = new DataInputStream(System.in);

        System.out.print("Enter a number: ");
        String numStr = input.readLine(); // Read as string
        int num = Integer.parseInt(numStr); // Parse the string into an integer

        System.out.println("You entered: " + num);
    }
}
