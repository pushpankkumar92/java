import java.util.Scanner;
public class fabonaciiseries {
    public static void main(String args[])
    {
        int x=0,y=1,z=0,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        n=sc.nextInt();
        while(z<=n)
        {
            System.out.println(z);
            x=y;
            y=z;
            z=x+y;
        }
    }
    
}
