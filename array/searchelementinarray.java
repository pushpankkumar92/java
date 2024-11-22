//Write a program to find search an element in array
package array;

import java.util.Scanner;

public class searchelementinarray {
    public static void main(String args[])
    {
        int a[]=new int[5];
        int n,count=0;
        Scanner z=new Scanner(System.in);
        System.out.println("enter element in array");
        for(int i=0;i<5;i++)
        {
         a[i]=z.nextInt();
        }
        System.out.println("Array element");
        for(int i=0;i<5;i++)
        {
         System.out.println(a[i]+" ");
        }
        System.out.println("Enter search element");
        n=z.nextInt();
        for(int i=0;i<5;i++)
        {
            if(a[i]==n)
            {
             count++;
            }
        }
        if(count>0)
        System.out.println("item found");
        else
        System.out.println("item not found");

    }
    


    
}
