import java.util.Scanner;
public class factorial {
    public static void main(String args[])
    {
        int i,fact=1;
        Scanner z=new Scanner(System.in);
        System.out.println("enter a no");
        i=z.nextInt();
        while(i>0)
        {
            fact=fact*i;
            i=i-1;
        }
        System.out.println("factorial="+fact);



    }
    
}
