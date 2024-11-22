
public class test {
    int num;
    static int rec;
    public void input(int z)
    {
        num=z;
        rec++;
    }
    public void show()
    {
        System.out.println("no="+num);
    }
    public void showrec()
    {
        System.out.println("record="+rec);
    }
    public static void main(String args[])
    {
        test a=new test();
        test b=new test();
        a.input(20);
        b.input(30);
        a.show();
        b.show();
        a.showrec();
        b.showrec();
    }
    
}
