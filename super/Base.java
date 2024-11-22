
public class Base {
    public Base(int n)
    {
        System.out.println("no="+n);
    }
    
}
public class Derived extends Base
{
    public Derived(int t)
    {
        super(t);
        System.out.println("Derived data="+t);
    }
    public static void main(String args[])
    {
        Derived d=new Derived(50);
    }
}
