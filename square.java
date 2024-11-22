import java.util.Scanner;
public class square {
    public static void main(String args[])
    {
        int s,area,peri;
        Scanner z=new Scanner(System.in);
        System.out.println("Enter side");
        s=z.nextInt();
        area=s*s;
        peri=4*s;
        System.out.println("area="+area);
        System.out.println("peri="+peri);
    }
    
}
