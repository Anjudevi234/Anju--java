import java.util.Scanner;
public class Shapes
{
    void area(int r1)
    {
    System.out.println("\nArea of circle with radius "+r1+"="+3.14*r1*r1);
}
void area(int l1,int b1)
{
    System.out.println("\nArea of Rectangle with dimension "+l1+"*"+b1+"="+l1*b1);
}
void area(int l2,int b2,int h2)
{
    System.out.println("\nArea of cuboid is with dimensions "+l2+"*"+b2+"*"+h2+"="+l2*b2*h2);
}
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    System.out.println("\nEnter the length");
    int l=s.nextInt();
    System.out.println("\nEnter the breadth");
    int b=s.nextInt();  
    System.out.println("\nEnter the Height");
    int h=s.nextInt();
    System.out.println("\nEnter the radius");
    int r=s.nextInt();
    Shapes ob=new Shapes();
    ob.area(r);
    ob.area(l,b);
    ob.area(l,b,h);
}
}

