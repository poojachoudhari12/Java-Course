import java.io.*;
public class KBD10
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
                int no=0;
                System.out.println("Enter a number whose table you want find: ");
                try{
                    no=Integer.parseInt(br.readLine());
                }
                catch(Exception e){
                    System.out.println("Invalide input");
                    return;
                }
                System.out.println("The number you Entered is : "+no);
                System.out.println("The table of it is: ");
                for(int i=1;i<=10;i++)
                {
                    System.out.println(no*i);
                }
        }
}
