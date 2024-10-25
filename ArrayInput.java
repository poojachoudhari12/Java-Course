/* Working with Arrays and the Scanner Class:
   The ArrayList<Integer> dynamically stores input values without needing to specify the size upfront.*/

   import java.util.ArrayList;
   import java.util.Scanner;
   
   public class ArrayInput {
       public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           ArrayList<Integer> numbers = new ArrayList<>();//An ArrayList called numbers is created to store the
           // numbers entered by the user. The ArrayList is of type Integer, which means it will store integers (whole numbers).
           
           System.out.println("Enter numbers, and type '0' to finish:");
           
           while (input.hasNextInt()) //This line starts a while loop that will keep running as long as the user 
                                       //enters valid integers. The method hasNextInt() checks if the next input is an integer.
           {
               int num = input.nextInt();
               if (num == 0) break;
               numbers.add(num);
           }
           
           // Calculate the average
           int sum = 0;
           for (int num : numbers) {
               sum += num;
           }
           
           double average = (double) sum / numbers.size();
           System.out.println("Average is: " + average);
       }
   }
   