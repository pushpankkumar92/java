
class Base {
    public void Show()
    {
        System.out.println("Hello");
    }
    
}
 class Derived extends Base
{
    public void Show()
    {
        System.out.println("Bye");
    }
    public static void main(String args[])
    {
        Derived d=new Derived();
        d.Show();
    }
}
