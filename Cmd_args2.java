//to print the entered only one number

public class Cmd_args2
{
	public static void main(String[] args)
	{
		int n=args.length;
		if(n!=1)
		{
			System.out.println("Invalide input please enter only one number");
		}
		try
		{
			n=Integer.parseInt(args[0]);
		}
		catch(Exception e)
		{
			System.out.println("Invalide input");
			return;
		}
		System.out.println("No: "+n);
	}
}