import java.util.Scanner;
public class armstrongno {
    public static void main(String args[])
    {
        int i,sum=0,x;
        Scanner z=new Scanner(System.in);
        System.out.println("Enter a no");
        i=z.nextInt();
        x=i;
        while(i>0)
        {
            sum=sum+(i%10)*(i%10)*(i%10);
            i=i/10;
        }
        if(sum==x)
        System.out.println("armstrong no");
        else
        System.out.println("not armstromg no");
        
    }
    
}
