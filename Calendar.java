class Calendar {
    public static void main(String[] args) {
        // Step 1: Check if command-line arguments are provided
        if (args.length != 3) {
            System.out.println("Usage: java Calendar <day> <month> <year>");
            return;
        }

        // Step 2: Store command-line arguments in variables
        int day = Integer.parseInt(args[0]);    // Convert first argument to integer (date)
        int month = Integer.parseInt(args[1]); // Convert second argument to integer (month)
        int year = Integer.parseInt(args[2]);  // Convert third argument to integer (year)

        // Step 3: Days in each month
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Step 4: Adjust for leap year
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            daysInMonth[2] = 29; // Set February to 29 days in a leap year
        }

        // Step 5: Validate the date and month
        if (month < 1 || month > 12 || day < 1 || day > daysInMonth[month]) {
            System.out.println("Invalid date! Please check the day and month.");
            return;
        }

        // Step 6: Calculate total days from the start of the year
        int totalDays = day;
        for (int i = 1; i < month; i++) {
            totalDays += daysInMonth[i];
        }

        // Step 7: Calculate total days from year 1 to the given year
        int totalOddDays = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400 ;

        totalOddDays+=totalDays;
        // Step 8: Find the weekday
        int weekday = totalOddDays % 7;

        // Step 9: Display the day of the week
        switch (weekday) {
            case 0: System.out.println("Sunday"); break;
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
        }
    }
}
