import java.util.Scanner;
public class sumofdigit {
    public static void main(String args[])
    {
        int i,sum;
        Scanner z=new Scanner(System.in);
        System.out.println("enter a no");
        i=z.nextInt();
        sum=0;
        while(i>0)
        {
            sum=sum+(i%10);
            i=i/10;
        }
        System.out.println("sum="+sum);
    }
    
}
