import java.util.Scanner;
public class power {
    public static void main(String args[])
    {
        int x,y,pro=1;
        Scanner z=new Scanner(System.in);
        System.out.println("enter a no");
        x=z.nextInt();
        System.out.println("enter second no");
        y=z.nextInt();
        while(y>0)
        {
            pro=pro*x;
            y--;
        }
        System.out.println("value="+pro);

    }



    
}
