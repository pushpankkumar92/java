import java.util.Scanner;
public class si {
    public static void main(String args[])
    {
        int p,r,t,si;
        Scanner z=new Scanner(System.in);
        System.out.println("Enter principal");
        p=z.nextInt();
        System.out.println("Enter rate");
        r=z.nextInt();
        System.out.println("Enter time");
        t=z.nextInt();
        si=(p*r*t)/100;
        System.out.println("Simple intrest="+si);
    }
    
}
