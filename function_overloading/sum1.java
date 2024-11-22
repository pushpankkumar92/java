public class sum1 {
    public void sum1(int x, int y)
    {
        System.out.println("sum="+(x+y));
    }
    public void sum1(float x,float y)
    {
        System.out.println("sum="+(x+y));
    }
    public static void main(String args[])
    {
        sum1 t=new sum1();
        t.sum1(10,20);
        t.sum1(2.5f,20.3f);
    }
    
}
