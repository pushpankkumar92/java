  
 class Base {
    public void show()
    {
        System.out.println("Hello");
    }
    
}
class Derived2 extends Base
{
    public void disp()
    {
        System.out.println("Bye");
    }
    public static void main(String args[])
    {
        Derived2 d=new Derived2();
        d.show();
        d.disp();
    }
}

    

