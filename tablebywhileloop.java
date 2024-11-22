import java.util.Scanner;
public class tablebywhileloop {
    public static void main(String args[])
    {
        int i,j;
        Scanner z=new Scanner(System.in);
        System.out.println("enter a no");
        i=z.nextInt();
        j=1;
        while(j<=10)
        {
            System.out.println(i*j);
            j++;
        }
    }
    
}
