
public class test {
    int x;
    public test()//default constructor
    {
        x=10;
    }
    public void show()
    {
        System.out.println(x);
    }
    public static void main(String args[])
    {
        test a=new test();
        a.show();
    }
    
}
