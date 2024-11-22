//Write a program to find length of array
package array;

import java.util.Scanner;

public class lengthofarray {
    public static void main(String args[])
    {
        int a[]=new int[5];
        Scanner z=new Scanner(System.in);
        System.out.println("Enter element in array");
        for(int i=0;i<a.length;i++)
        {
          a[i]=z.nextInt();
        }
        System.out.println("Array element");
        for(int i=0;i<a.length;i++)
        {
          System.out.println(a[i]+" ");
        }
        System.out.println("Array length"+a.length);

    }
    
}
