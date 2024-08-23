//prg to count zc,pc,nc
public class Cmd_args8
{
    public static void main(String[] args)
    {
        int zc=0,pc=0,nc=0,oth=0;
        int n=args.length;
        if(n<2)
        {
            System.out.println("Invalide input");
        }
        
        for(int i=0;i<n;i++)
        {
            try
            {
                int val=Integer.parseInt(args[i]);
                if(val==0)
                {
                    zc++;
                }
                else
                {
                    if(val>0)
                        pc++;
                    else
                        nc++;    
                }
            }
            catch(Exception e)
            {
                oth++;
            }
        }
        System.out.println("Zero count: "+zc+"\nPositive count: "+pc+"\nNegative count: "+nc+"\nōOther: "+oth);
    }
}