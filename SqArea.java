public class SqArea
{
    int a;
    void getinput(int side)
    {
        a=side;
    }
    int calArea()
    {
        return a*a;
    }
    public static void main(String args[])
    {
        SqArea ob=new SqArea();
        ob.getinput(6);
        System.out.println("Area of square="+ob.calArea());
    }
    }
