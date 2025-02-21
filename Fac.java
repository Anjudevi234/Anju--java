import java.util.Scanner;
public class Fac
{
    int age;
    String name;
    void getData()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("\n\nEnter Faculty name:");
        name=scan.nextLine();
        System.out.println("\n\nenter Age:");
        age=scan.nextInt();
    }
    void display()
    {
        System.out.println("Facylty name:"+name);
        System.out.println("Age:"+age);
    }
    public static void main(String args[])
    {
        Fac e =new Fac();
        e.getData();
        System.out.println("\n\nFaculty Details\n");
        System.out.println("\n\n------------------");
        e.display();
    }
}