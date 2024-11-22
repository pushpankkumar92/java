
public class test {
    int x;
    public test(int z)
    {
        x=z;
    }
    public void show()
    {
        System.out.println(x);
    }
    public static void main(String args[])
    {
        test a=new test(20);
        a.show();
        test b=new test(50);
        b.show();
    }
    
}
