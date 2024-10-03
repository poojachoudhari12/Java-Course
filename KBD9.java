import java.io.*;
public class KBD9
{
	public static void main(String[] args)
	{
		InputStreamReader isr=null;
		BufferedReader br=null;
		try
		{
			isr=new InputStreamReader(System.in);
			br=new BufferedReader(isr);
		}
		catch(Exception e){}
		int no;
		System.out.println("Enter a number: ");
		try
		{
		     no=Integer.parseInt(br.readLine());//if you declaire here only no variable then it will occur error while call down side so declareoutside the try block 
		}
		catch(Exception e)
		{
			System.out.println("Inalide Input");
			return;
		}
		System.out.println("Number: "+no);//here
	}
}
/*you can actually combine the two try blocks into one.
  try {
    isr = new InputStreamReader(System.in);
    br = new BufferedReader(isr);
    String str = br.readLine();
    } catch (IOException e) {
    System.err.println("Error reading from console: " + e.getMessage());}
 
  By combining the two try blocks, you're catching any IOException that might occur during the creation of the InputStreamReader and BufferedReader, 
  as well as during the readLine() operation.

  In Java, variables declared inside a try block are scoped to that block, which means they are only accessible within that block. This is because the
  try block is a separate scope, and variables declared inside it are not visible outside of it.
}*/