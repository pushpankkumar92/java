//Write a program to find sum of array element in java
package array;

import java.util.Scanner;

public class sumofarrayelement {
    public static void main(String args[])
    {
        int a[]=new int[5];
        int sum=0;
        Scanner z=new Scanner(System.in);
        System.out.println("enter element in array");
        for(int i=0;i<5;i++)
        {
          a[i]=z.nextInt();
        }
        System.out.println("enter array element");
        for(int i=0;i<5;i++)
        {
          System.out.println(a[i]+" ");
          sum=sum+a[i];
        }
        System.out.println("sum of array element"+sum);
    
    }
    
}
