package class_object;

import java.util.Scanner;

public class reverse {
    int i,x,rev=0;
    void getdata()
    {
        Scanner z=new Scanner(System.in);
        System.out.println("enter no");
        i=z.nextInt();
        x=i;
    }
    void putdata()
    {
     while(i>0)
     {
        rev=(rev*10)+i%10;
        i=i/10;
     }
     System.out.println("reverse="+rev);
    }
    public static void main(String args[])
    {
        
        reverse aa=new reverse();
        aa.getdata();
        aa.putdata();

    }
    
}
