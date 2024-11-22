
public class test1 {
    int x;
    public test1(int x)
    {
        this.x=x;
    }
    public void show()
    {
        System.out.println(x);
    }
    public static void main(String args[])
    {
        test1 a=new test1(20);
        a.show();
        test1 b=new test1(50);
        b.show();
    }
    
}
