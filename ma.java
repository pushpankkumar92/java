import java.util.Scanner;
public class  ma{
    public static void main(String args[])
    {
        int a,b,ch;
        Scanner z=new Scanner(System.in);
        System.out.println("enter a no");
        a=z.nextInt();
        System.out.println("enter second no");
        b=z.nextInt();
        System.out.println("enter your choice 1->add 2->sub 3->mult 4->div enter your choice:");
        ch=z.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("addition="+(a+b));
            case 2:
            System.out.println("sub="+(a-b));
            case 3:
            System.out.println("mult="+(a*b));
            case 4:
            System.out.println("div="+(a/b));
            default:
            System.out.println("invalid choice");

        }

    }
    
}
