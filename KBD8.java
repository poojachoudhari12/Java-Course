/* 
   Some common classes and interfaces in the java.io package include:

File
FileReader
FileWriter
BufferedReader
BufferedWriter
InputStream
OutputStream
Reader
Writer
ObjectInputStream
ObjectOutputStream
InputStreamReader
OutputStreamWriter
When deciding whether to use import java.io.*;, ask yourself:

Am I reading or writing files?
Am I working with input/output streams?
Am I using serialization or deserialization?
Am I working with character encodings?
If you answered "yes" to any of these questions, you'll likely need to use classes or interfaces from the java.io package, and import java.io.*; will be necessary.

Note that it's generally a good practice to import only the specific classes or interfaces you need, rather than using a wildcard import like import java.io.*;. This can help avoid naming conflicts and make your code more readable.
   InputStreamReader is a bridge from byte streams to character streams. It reads bytes and decodes them into characters using a 
   specified charset. In this case, it's used to read from the standard input stream System.in, which is a byte stream.
   
   BufferedReader provides buffering for the input stream, which means it stores the input data in a buffer before it's actually read.
   In computer science, a buffer is a region of memory used to hold data temporarily while it is being moved from one place to another.
   It acts as a intermediate storage location that helps to improve the performance and efficiency of data transfer operations.
   
   Improved performance: By reducing the number of read or write operations, buffers can improve the performance of data transfer operations.
   Efficient use of resources: Buffers can help to reduce the amount of memory or I/O resources required for data transfer operations.
   Smoother data transfer: Buffers can help to smooth out the data transfer process by providing a steady supply of data to the destination.
   
   Here are some scenarios where you might want to use a BufferedReader:

   Reading large files: When reading large files, using a BufferedReader can improve performance by reducing the number of disk I/O operations.
   The buffer can hold a significant amount of data, reducing the number of read operations needed to process the file.
   Reading from a slow input source: If the input source is slow, such as a network connection or a user typing input, a BufferedReader can help
   to improve responsiveness by buffering the input data and providing a steady supply of data to the program.
   Reading line-by-line: When you need to read a file or input stream line-by-line, a BufferedReader provides a convenient readLine() method that 
   returns a complete line of text, including newline characters.Reading character-based data: BufferedReader is suitable for reading character-based
   data, such as text files, XML files, or JSON data.
   When you need to read ahead: In some cases, you might need to read ahead in the input stream to parse or process the data. A BufferedReader allows 
   you to read ahead and then reset the buffer to a previous position if needed.
   When you need to handle large amounts of data: If you're working with large datasets or logs, a BufferedReader can help to process the data in chunks, 
   reducing memory usage and improving performance.

   here InputStreamReader isr=null; BufferedReader br=null; are used  like scanner to input but why  we have use it is discribed upside-^
*/

import java.io.*;
public class KBD8
{
	public static void main(String[]args)
	{
		InputStreamReader isr=null;
		BufferedReader br=null;
		try
		{
			isr=new InputStreamReader(System.in);
			br=new BufferedReader(isr);
		}
		catch(Exception e){}
		System.out.println("Enter a String: ");
		try
		{
			String str=br.readLine();	
			System.out.println("The String entered by you is: "+str);
		}
		catch(Exception e){}
		System.out.println(isr);
		
	}
}

/*Here's an explanation of the output:

The first line "String" is printed because of the System.out.println("String"); statement.
The second line java.io.InputStreamReader@15db9742 is the output of the System.out.println(isr); statement.*/
