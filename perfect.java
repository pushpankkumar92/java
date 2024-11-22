import java.util.Scanner;
public class perfect {
    public static void main(String args[])
    {
        int i,n,sum=0;
        Scanner z=new Scanner(System.in);
        System.out.println("enter a no");
        n=z.nextInt();
        for(i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n)
        System.out.println("pwrfect no");
        else
        System.out.println("not perfect");

        
    }
    
}
