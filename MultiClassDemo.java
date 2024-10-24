class Circle
{
    double x, y, r;

    double Circumference()
    {
        return 2 * 3.14 * r;
    }

    double Area()
    {
        return 3.14 * r * r;
    }
}

class Box
{
    double width, height, depth;

    double Area()
    {
        return 2 * (width * height + height * depth + depth * width);
    }

    double volume()
    {
        return width * height * depth;
    }
}

public class MultiClassDemo
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle();
        c1.x = 0.0;
        c1.y = 0.0;
        c1.r = 5.0;

        Box b1 = new Box();
        b1.width = 3.0;
        b1.height = 4.0;
        b1.depth = 5.0;

        System.out.println("Circumference of Circle: " + c1.Circumference());
        System.out.println("Area of Circle: " + c1.Area());
        System.out.println("Area of Box: " + b1.Area());
        System.out.println("Volume of Box: " + b1.volume());
    }
}