class B {
}
class C extends B
{
    public void show()
    {
        System.out.println("Hello");
    }
}
class D extends B
{
    public void disp()
    {
        System.out.println("Bye");
    }
}
class M
{
    public void pass(B  Z)
    {
        if(Z instanceof C)
        {
            C t=(C)Z;
            t.show();
        }
        else if(Z instanceof D)
        {
            D t=(D)Z;
            t.disp();
        }
        else
        System.out.println("no method define");
    }
    public static void main(String args[])
    {
        M p=new M();
        p.pass(new B());
        p.pass(new C());
        p.pass(new D());
    }
}
    
    

