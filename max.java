import java.util.Scanner;
public class max {
    public static void main(String args[])
    {
        int a,b;
        Scanner z=new Scanner(System.in);
        System.out.println("Enter a no");
        a=z.nextInt();
        System.out.println("Enter second no");
        b=z.nextInt();
        if(a>b)
        System.out.println("max="+a);
        else
        System.out.println("max="+b);

        
    }
    
}
