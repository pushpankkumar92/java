public class sum {
    public void sum(int x,int y)
    {
        System.out.println("sum="+(x+y));
    }
    public void sum(int x,int y,int z)
    {
        System.out.println("sum="+(x+y+z));
    }
    public static void main(String[] args)
    {
        sum t=new sum();
        t.sum(10,20);
        t.sum(10,20,30);
    }

}
