//program to display the prime number from 10-100

public class App7
{
	public static void main(String [] args)
	{
		int n=10,i=2;
		String str="Prime Numbers from 10-100 are:\n";
		while(n<=100)
		{
			for(i=2;i<n;i++)
			{
				if(n%i==0)
				break;
			}
			if(i==n)
			str=str+" "+n;
			n++;
		}
		System.out.println(str);
	}
}