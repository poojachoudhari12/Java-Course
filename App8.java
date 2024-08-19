//to print a n in different types

public class App8
{
	public static void main(String[]args)
	{
		int n=(int)(Math.random()*100);
		System.out.println("No: "+n);
		String str=Integer.toBinaryString(n);
		System.out.println("toBinaryString:"+str);
		str=Integer.toOctalString(n);
		System.out.println("toOctalString:"+str);
		str=Integer.toHexString(n);
		System.out.println("toHexString:"+str);
		str=Integer.toString(n);
		System.out.println("toString:"+str);
		
	}
}