//to search for a element in array

import java.util.*;
public class KBD5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a=null;
		a=new int[5];
		int tot=0;
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter value at a["+i+"]: ");
			a[i]=sc.nextInt();
			tot=tot+a[i];
		}
		String str="Data: "+Arrays.toString(a)+"\nTotal: "+tot;
		System.out.println("Array before sorting: "+str);
		Arrays.sort(a);
		System.out.println("Arrays after sorting: "+Arrays.toString(a));

		System.out.println("Enetr the search value: ");
		int sv=sc.nextInt();
		if(Arrays.binarySearch(a,sv)==-1)
			System.out.println("Not found");
		else
			System.out.println(" search Found");
	}
}