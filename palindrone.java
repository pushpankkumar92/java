import java.util.Scanner;
public class palindrone {
    public static void main(String args[])
    {
        int i,rev=0,x;
        Scanner z=new Scanner(System.in);
        System.out.println("Enter a no");
        i=z.nextInt();
        x=i;
        while(i>0)
        {
            rev=(rev*10)+i%10;
            i=i/10;
        }
        if(rev==x)
        
            System.out.println("palinsrone no");
            else
            System.out.println("not palindrone no");
        
    }
    
}
