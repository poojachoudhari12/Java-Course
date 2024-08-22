//To input a number and display table of it

public class Cmd_args3
{
	public static void main(String[]args)
	{
		int i=0,no=0,n=args.length;
		String Str="\nTable";
		if(n!=1)
		{
			System.out.println("Invalide input");
			return;
		}
		try
		{
			no=Integer.parseInt(args[0]);
		}
		catch(Exception e)
		{
			System.out.println("Invalide data");
			return;
		}
		for(i=1;i<=10;i++)
		{
			Str=Str+" "+(no*i);	
		}
		System.out.println(Str);
	}
}