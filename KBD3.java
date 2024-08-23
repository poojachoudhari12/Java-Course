//to take input from user and display it

import java.util.*;
public class KBD3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String[] a=null;
		a=new String[5];
		int i=0;
		for(i=0;i<a.length;i++)
		{
			System.out.println("Enter the city name: "+i+": ");
			a[i]=sc.next();	
		}
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
}