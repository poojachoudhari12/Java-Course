class Circle1
{
    double x,y,r;

    Circle1(double a,double b,double c)
    {
        x=a;
        y=b;
        r=c;
    }
    double Circumference()
    {
        return 2*3.14*r;
    }
    double Area()
    {
        return 3.14*r*r;
    }
}
public class Demonstration_38
{
    public static void main(String[] args)
    {
        Circle1 c1 = new Circle1(3.0, 4.0, 5.0); // Create Circle c1 with automatic initialization
        Circle1 c2 = new Circle1(6.0, 8.0, 10.0); // Create Circle c2 with different values

        System.out.println("Circle 1 -> Circumference: " + c1.Circumference() + ", Area: " + c1.Area());
        System.out.println("Circle 2 -> Circumference: " + c2.Circumference() + ", Area: " + c2.Area());
    }
}