import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the num1: ");
        int num1=sc.nextInt();

        System.out.println("Enter the num2: ");
        int num2=sc.nextInt();

        System.out.println("Enter the operation that you want to perform(+,-,*,/): ");
        char operator=sc.next().charAt(0);

        int result=0;

        switch(operator)
        {
            case '+':
               result = num1+num2; break;
            case '-':
               result =num1-num2; break;
            case '*':
               result =num1*num2; break;
            case '/':
               result =num1/num2; break;
            default:
                System.out.println("Invalid operation!");        
        }
        System.out.println("The result is: "+result);
    }
}