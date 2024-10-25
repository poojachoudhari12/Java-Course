//this Keyword for Resolving Name Conflicts
class Student
{
    int rollno;
    String name;
    String course;
    double marks;

    Student(int rollno,String name,String course,double marks)
    {
        this.rollno=rollno;
        this.name=name;
        this.course=course;
        this.marks=marks;
    }

    void Display()
    {
        System.out.println("Roll no: "+rollno+"\nName: "+name+"\nCourse: "+course+"\nMarks: "+marks);
    }
}
public class Demonstration_41
{
    public static void main(String[]args)
    {
        Student s=new Student(12,"Pooja","AIML",82);
        s.Display();
    }
}