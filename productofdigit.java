import java.util.Scanner;
public class productofdigit {
    public static void main(String args[])
    {
        int i,pro=1;
        Scanner z=new Scanner(System.in);
        System.out.println("Enter a no");
        i=z.nextInt();
        while(i>0)
        {
            pro=pro*(i%10);
            i=i%10;
        }
        System.out.println("product="+pro);
    }
    
}
