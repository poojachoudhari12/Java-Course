public class CommandLineInput {
    public static void main(String[] args) {
        // Check if any command line arguments were passed
        if (args.length == 0) {
            System.out.println("No command line arguments found.");
        } else {
            // Loop through args array and print each argument
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + i + ": " + args[i]);
            }
        }
    }
}
