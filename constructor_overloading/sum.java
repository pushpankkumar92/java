
public class sum {
    public sum(int x,int y)
    {
        System.out.println("sum="+(x+y));
    }
    public sum(float x,float y)
    {
        System.out.println("sum="+(x+y));
    }
    public static void main(String args[])
    {
        sum a=new sum(10,20);
        sum b=new sum(10.20f,20.10f);
    }
    
}
