//write a program to print array element in java
package array;

import java.util.Scanner;

public class printarrayelement {
    public static void main(String args[])
    {
        int size,i;
        Scanner z=new Scanner(System.in);
        System.out.println("enter size of array");
        size=z.nextInt();
        int a[]=new int [size];
        for(i=0;i<size;i++)
        {
            a[i]=z.nextInt();
        }
        System.out.println("printed array element are");
        for(i=0;i<size;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
    
}
