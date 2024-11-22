
public class Base1 {
    public base()
    {
        System.out.println("Hello");
    }
    
}
class Derived extends Base1
{
    public void disp()
    {
        System.out.println("Bye");
    }
    public static void main(String args[])
    {
        Derived d=new Derived();
        d.disp();
    }
}
