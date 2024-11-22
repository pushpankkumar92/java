import java.util.Scanner;
public class one {
    public static void main(String args[])
    {
        int a,b,c,d,e,f;
        Scanner z=new Scanner(System.in);
        System.out.println("Enter a no");
        a=z.nextInt();
        System.out.println("Enter second no");
        b=z.nextInt();
        c=a+b;
        d=a-b;
        e=a*b;
        f=a/b;
        System.out.println("addition="+c);
        System.out.println("sustraction="+d);
        System.out.println("multiplication="+e);
        System.out.println("division="+f);
    }
    
}
