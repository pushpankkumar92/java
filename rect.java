import java.util.Scanner;
public class rect {
    public static void main(String args[])
    {
        int l,b,area,peri;
        Scanner z=new Scanner(System.in);
        System.out.println("Enter length");
        l=z.nextInt();
        System.out.println("Enter breadth");
        b=z.nextInt();
        area=l*b;
        peri=2*(l+b);
        System.out.println("area="+area);
        System.out.println("perimeter="+peri);
    }
    
}
