import java.util.Scanner;
public class check {
    public static void main(String args[])
    {
        int a;
        Scanner z=new Scanner(System.in);
        System.out.println("Enter a no");
        a=z.nextInt();
        if(a>0)
        System.out.println("possitive no");
        else if(a<0)
        System.out.println("negative no");
        else
        System.out.println("zero");
    }
    
}
