//Write a program to find array reverse element in java
package array;

import java.util.Scanner;

public class arrayreverseelement {
    public static void main(String args[])
    {
        int a[]=new int[5];
        Scanner z=new Scanner(System.in);
        System.out.println("Enter array element are");
        for(int i=0;i<a.length;i++)
        {
            a[i]=z.nextInt();
        }
        System.out.println("array elements");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
        System.out.println("Array reverse element");
        for(int i=a.length-1;i>=0;i--)
        {
           System.out.println(a[i]+" "); 
        }
    }
    
    
}
