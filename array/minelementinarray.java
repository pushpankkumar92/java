//Write a program to find min element in array
package array;

import java.util.Scanner;

public class minelementinarray {
    public static void main(String args[])
    {
        int a[]=new int[5];
        int min=0;
        Scanner z=new Scanner(System.in);
        System.out.println("enter array element");
        for(int i=0;i<a.length;i++)
        {
            a[i]=z.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
               min=a[i];
            }
        }
        System.out.print("minimum element"+min);

    }
    
}
