
public class test {
    int num;
    static int rec;
    public test(int t)
    {
        num=t;
        rec++;
    }
    public void show()
    {
        System.out.println("no="+num);
    }
    public static void showrec()
    {
        System.out.println("record no="+rec);
    }
    public static void main(String args[])
    {
        test a=new test(10);
        test b=new test(20);
        test c=new test(30);
        a.show();
        b.show();
        c.show();
        test.showrec();
    }
    
}
