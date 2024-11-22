
 class B {
    public void show()
    {
        System.out.println("Hello");
    }
    
}
class D extends B
{
    public void show()
    {
        System.out.println("Bye");
    }
    public static void main(String args[])
    {
        B z=new B();
        z.show();
        B p=new D();
        p.show();
    }
}
