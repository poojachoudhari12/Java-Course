//Input Using Scanner Class
import java.util.Scanner;
public class UserInput
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name: ");
        String nm=sc.nextLine();

        System.out.println("Enter your age: ");
        int age=sc.nextInt();

        System.out.println("Hello "+nm+" you are "+age+" year old");
    }
}