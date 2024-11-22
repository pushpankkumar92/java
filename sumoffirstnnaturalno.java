import java.util.Scanner;
public class sumoffirstnnaturalno {
    public static void main(String args[])
    {
        int i,n,sum;
        Scanner z=new Scanner(System.in);
        System.out.println("enter a no");
        n=z.nextInt();
        i=1;
        sum=0;
        while(i<=n)
        {
            sum=sum+i;
            i=i+1;
        }
        System.out.println("sum="+sum);
    }
    
}
