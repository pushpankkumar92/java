import java.util.Scanner;
public class even {
    public static void main(String args[])
    {
        int a;
        Scanner z=new Scanner(System.in);
        System.out.println("enter a no");
        a=z.nextInt();
        if(a%2==0)
        System.out.println("even");
        else
        System.out.println("odd");
    }
    
}
