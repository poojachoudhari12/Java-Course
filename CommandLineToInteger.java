public class CommandLineToInteger {
    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                int number = Integer.parseInt(args[0]);
                System.out.println("The number is: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format: " + args[0]);
            }
        } else {
            System.out.println("No command line argument found.");
        }
    }
}
