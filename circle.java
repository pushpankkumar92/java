import java.util.Scanner;
public class circle {
    public static void main(String args[])
    {
        float r,area;
        Scanner z=new Scanner(System.in);
        System.out.println("Enter radius");
        r=z.nextFloat();
        area=3.14f*r*r;
        System.out.println("area="+area);
    }
    
}
