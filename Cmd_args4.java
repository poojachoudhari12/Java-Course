//to input only one number and reverse it

public class Cmd_args4
{
	public static void main(String[] args)
	{
		int no=0,n=args.length,rev=0;
		if(n!=1)
		{
			System.out.println("Invalide data");
			return;
		}
		try
		{
			no=Integer.parseInt(args[0]);
		}
		catch(Exception e)
		{
			System.out.println("Invalide Input");
			return;
		}
		System.out.println("No:"+no);
		while(no>0)
		{
		rev=rev*10+(no%10);
		no=no/10;
		}
		System.out.println("Reverse: "+rev);
	}
}