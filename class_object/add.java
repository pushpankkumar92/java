package class_object;

import java.util.Scanner;

public class add {
    int a,b;
    void getdata()
    {
        Scanner z=new Scanner(System.in);
        System.out.println("Enter first no");
        a=z.nextInt();
        System.out.println("enter second no");
        b=z.nextInt();
    }
    void putdata()
    {
        System.out.println("additon="+(a+b));
    }
    public static void main(String args[])
    {
        add aa=new add();
        aa.getdata();
        aa.putdata();
    }
    
}
