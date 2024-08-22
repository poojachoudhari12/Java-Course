public class Cmd_args1
{
	public static void main(String [] args)
	{
		int n=args.length;
		int i=0;
		if(n==0)
		{
		System.out.println("Invalide input");
		}
		while(i<n)
		{
		System.out.println(args[i]);
		i++;
		}	
	}
}