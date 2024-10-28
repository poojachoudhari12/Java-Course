import java.util.Scanner;

public class ScennerExample 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int max=Math.max(a,b);
        System.out.println("The max number is: "+max);
    }
}