final class B {
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
        D t=new D();
        t.show();
    }
}
