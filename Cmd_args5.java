//to print the inputed only one string and reverse it by using /string Buffered

public class Cmd_args5
{
	public static void main(String[] args)
	{
		int i=0,n=args.length;
		if(n!=1)
		{
			System.out.println("Invalide input");
			return;
		}
		try
		{
			n=Integer.parseInt(args[0]);
		}
		catch(Exception e)
		{
			System.out.println("Invalide Input");
			return;
		}
		System.out.println("No: "+n);
		StringBuffer a=new StringBuffer(args[0]);
		StringBuffer b=a.reverse();
		System.out.println("Reversed String: "+b);
	}
}