//intialise througth method
class Point
{
    int x,y;//Data members

    void setpoint()
    {
        x=10;
        y=10;
    }
}
public class Demonstration_35
{
    public static void main(String[] args)
    {
        Point p=new Point();
        p.setpoint();

        System.out.println("x: "+p.x+"\ny: "+p.y);
    }
}
