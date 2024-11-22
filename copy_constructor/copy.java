
public class copy {
    int x;
    public copy(int x)
    {
        this.x=x;
    }
    public copy(copy z)
    {
        x=z.x;
    }
    public void show()
    {
        System.out.println(x);
    }
    public static void main(String args[])
    {
        copy a=new copy(25);
        a.show();
        copy b=new copy(a);
        b.show();
    }

    
}
