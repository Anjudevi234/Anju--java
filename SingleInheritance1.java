class Inheritance
{
    int id=15;
    String ename="Anju";
}
class Child extends Inheritance
{
   int age=21;
   void putdata()
   {
    System.out.println("Id:"+id);
   System.out.println("Ename:"+ename);
   System.out.println("Age:"+age);
}
}
class SingleInheritance1
{
    public static void main(String args[])
    {
        Child ob=new Child();
        ob.putdata();
        }
        }
    