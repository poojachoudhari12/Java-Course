/*
Algorithm: 
  1. Create class Calendar. 
  2. Define the main method. 
  3. Store command line arguments in particular variables. (First is date, second is month and third is year). 
4. By using switch case and different for loops display particular day for given date.
5. Save the program with the name of the class which consist of main() method.
6. Compile the program from command prompt by using javac command. 
7. Execute program by passing command line arguments. 

*String[] args is an array of strings that stores the command-line arguments passed to the program when it is executed.
*If you run the program and pass 123 23 as arguments, args will contain two elements: args[0] = "123" and args[1] = "23".
*/
public class Calendar {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Invalid date. The format should be date month year");
            return;
        }

        int date, mnth, yr;
        try {
            date = Integer.parseInt(args[0]);
            mnth = Integer.parseInt(args[1]);
            yr = Integer.parseInt(args[2]);

            // Implement the logic to calculate the day of the week for the given date
            // For simplicity, let's assume we have a method called calculateDayOfWeek
            String dayOfWeek = calculateDayOfWeek(date, mnth, yr);
            System.out.println("The day of the week is " + dayOfWeek);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide numeric values for date, month, and year");
        }
    }

    // Implement the calculateDayOfWeek method
    private static String calculateDayOfWeek(int date, int mnth, int yr) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int t = date;
        int m = mnth;
        int y = yr;

        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int q = t;
        int K = y % 100;
        int J = y / 100;

        int f = q + ((13 * (m + 1)) / 5) + K + (K / 4) + (J / 4) - (2 * J);
        int day = f % 7;

        return days[day];
    }
}