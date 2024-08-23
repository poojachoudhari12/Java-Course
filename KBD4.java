// to input city names and display and search for a element
import java.util.*;
public class KBD4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String[] a=null;
		a=new String[5];
		int i=0;
		for(i=0;i<a.length;i++)
		{
			System.out.print("Enter the city names:"+i+": ");
			a[i]=sc.next();	
		}
		System.out.println("Array before sorting: "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Arrays after sorting: "+Arrays.toString(a));

		System.out.println("Enter search city: ");
		String str=sc.next();
		if(Arrays.binarySearch(a,str)==-1)
			System.out.println("Not Found");
		else
			System.out.println("Search found");
	}
}