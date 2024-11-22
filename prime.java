import java.util.Scanner;
public class prime {
    public static void main(String args[])
    {
        int i,count=0,n;
        Scanner z=new Scanner(System.in);
        System.out.println("Enter a no");
        n=z.nextInt();
        i=1;
        while(i<=n)
        {
            if(n%i==0)
            {
                   count=count+i;
              i=i+1;
            }
            if(count==2)
            
                System.out.println("prime no");
                else
                System.out.println("not prime");
            
        }
    }
    
}
