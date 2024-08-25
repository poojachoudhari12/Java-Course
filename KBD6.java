//to input a array of elemenets of integer and display
import java.util.*;
public class KBD6
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int i=0,n;
		System.out.println("\nEnter the size of array: ");
		n=sc.nextInt();
		int[] a=null;
		a=new int[n];
		for(i=0;i<a.length;i++)
		{
			System.out.println("Enter element at A["+i+"]:");
			a[i]=sc.nextInt();	
		}
		System.out.println("Array before sorting: "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array after sorting: "+Arrays.toString(a));
	}
}