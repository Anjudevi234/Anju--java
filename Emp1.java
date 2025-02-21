import java.util.Scanner;
public class Emp1
{
    int empno;
    String name;
    void getData()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("\n\nEnter Employee name:");
        name=scan.nextLine();
        System.out.println("\n\nenter Emp No:");
        empno=scan.nextInt();
    }
    void display()
    {
        System.out.println("Employee Nmae:"+name);
        System.out.println("Employee no:"+empno);
    }
    public static void main(String args[])
    {
        Emp1 e =new Emp1();
        e.getData();
        System.out.println("\n\nEmployee Details\n");
        System.out.println("\n\n------------------");
        e.display();
    }
}