import java.util.Scanner;
public class reverseofagivenno {
    public static void main(String args[])
    {
        int i,rev;
        Scanner z=new Scanner(System.in);
        System.out.println("Enter a no");
        i=z.nextInt();
        rev=0;
        while(i>0)
        {
            rev=(rev*10)+i%10;
            i=i/10;
        }
        System.out.println("rev="+rev);
    }
    
}
