/* Title: Create a class called Employee that includes three pieces of information as instance
variables- first name, a last name and a monthly salary. Your class should have a
constructor that initializes the three instance variables. Provide a set and a get method for
each instance variable. If the monthly salary is not positive, set it to 0.0. Write a test
application named EmployeeTest that demonstrates class Employee's capabilities. Create
two Employee objects and display each object's yearly salary. Then give each Employee a
10% raise and display each Employee's yearly salary again.*/
import java.util.Scanner;
class Employee{
   private String Fname;
   private String Lname;
   private double Salary;

   public Employee(String Fname, String Lname, double Salary){
        this.Fname=Fname;
        this.Lname=Lname;
        if(Salary>0)
            this.Salary=Salary;
        else
            this.Salary=0.0;
    }
    public void setDetails(String Fname,String Lname,Double Salary)
    {
        this.Fname=Fname;
        this.Lname=Lname;
        if(Salary>0)
        this.Salary=Salary;
        else
        this.Salary=0.0;
        
    }
    public void getDetails()
    {
        System.out.println("First Name: "+Fname);
        System.out.println("Last Name: "+Lname);
        System.out.println("Monthly Salary: "+Salary);
    }
    public void setFname(String Fname) {
        this.Fname = Fname;
    }
    public String getFname() {
        return Fname;
    }
    public void setLname(String Lname)
    {
        this.Lname=Lname;
    }
    public String getLname(String Lname)
    {
        return Lname;
    }
    public void setSalary(Double Salary)
    {
        if(Salary>0)
        this.Salary=Salary;
        else
        this.Salary=0.0;
    }
    public Double getSalary()
    {
        return Salary;
    }
    public Double getYearlySalary()
    {
        return Salary*12;
    }
    public void giveRise()
    {
        Salary*=1.1;
    }   
}
public class EmployeeTest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Employee emp1=new Employee("Pooja","Choudhari",1000);
        Employee emp2=new Employee("Sona","Choudhari",2000);

        System.out.println("Enter the details of Emp1: ");
        System.out.println("Enter First name: ");
        String firstName1=sc.next();
        System.out.println("Enter Last name: ");
        String lastName1=sc.next();
        System.out.println("Enter the Salary of Emp1: ");
        Double monthlySalary1=sc.nextDouble();
        emp1.setDetails(firstName1,lastName1,monthlySalary1);

        System.out.println("Enter the details of Emp2: ");
        System.out.println("Enter First name: ");
        String firstName2=sc.next();
        System.out.println("Enter Last name: ");
        String lastName2=sc.next();
        System.out.println("Enter the Salary of Emp1: ");
        Double monthlySalary2=sc.nextDouble();
        emp1.setDetails(firstName2,lastName2,monthlySalary2);

        System.out.println("Emp1 yearly Salary: "+emp1.getYearlySalary());
        System.out.println("Emp2 yearly Salary: "+emp2.getYearlySalary());

        emp1.giveRise();
        emp2.giveRise();

        System.out.println("Salary after change of 10%: ");
        System.out.println("Emp1 yearly Salary: "+emp1.getYearlySalary());
        System.out.println("Emp2 yearly Salary: "+emp2.getYearlySalary());

        sc.close();

    }
}