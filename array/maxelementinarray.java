//Write a program to find max element in array
package array;

import java.util.Scanner;

public class maxelementinarray {
    public static void main(String args[])
    {
        int a[]=new int[5];
        int max=0;
        Scanner z=new Scanner(System.in);
        System.out.println("enter element in array");
        for(int i=0;i<5;i++)
        {
            a[i]=z.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.print("maximum element"+max);
    }
    

}
