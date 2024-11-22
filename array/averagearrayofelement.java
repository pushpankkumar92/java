//Write a program to find average of array element
package array;

import java.util.Scanner;

public class averagearrayofelement {
    public static void main(String args[])
    {
        int a[]=new int[5];
        int sum=0;double avg;
        Scanner z=new Scanner(System.in);
        System.out.println("enter array element");
        for(int i=0;i<5;i++)
        {
            a[i]=z.nextInt();
        }
        System.out.println("Array elements");
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]+" ");
        }
        for(int i=0;i<5;i++)
        {
            sum=sum+a[i];
        }
        avg=sum/5.0;
        System.out.println("average of array"+avg);
    }
    
}
