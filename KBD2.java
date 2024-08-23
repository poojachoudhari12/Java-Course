//to input city names in array and display
import java.util.*;

public class KBD2
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String[] a=null;
        a=new String[5];
        int i=0;
        for(i=0;i<a.length;i++)
        {
            System.out.println("Enter the City Name: "+i+":");
            a[i]=sc.next();
        }
        for(i=0;i<a.length;i++)
        {
            System.out.println("\nThe city Names are: "+i+": "+a[i]);
        }
    }

}
/*a[i]: This is referring to the i-th element of the array a. 
Think of it like a box labeled i that can hold a string value.
sc.next(): This is a method call on the Scanner object sc. 
The next() method reads the next input from the user (in this case, a string) and returns it. */