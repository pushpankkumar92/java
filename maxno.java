import java.util.Scanner;
public class maxno {
    public static void main(String args[])
    {
    int a,b,c;
    Scanner z=new Scanner(System.in);
    System.out.println("Enter a no");
    a=z.nextInt();
    System.out.println("Enter second no");
    b=z.nextInt();
    System.out.println("Enter third no");
    c=z.nextInt();
    if(a>b && a>c)
    System.out.println("max="+a);
    else if(b>c)
    System.out.println("max="+b);
    else
    System.out.println("max="+c);
    }
    
}
