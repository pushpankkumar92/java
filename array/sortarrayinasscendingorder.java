//Write a program to sort array in asscending order
package array;

import java.util.Scanner;

public class sortarrayinasscendingorder {
    public static void main(String args[])
    {
        int a[]=new int[5];
        int temp;
        Scanner z=new Scanner(System.in);
        System.out.println("enter array element");
        for(int i=0;i<5;i++)
        {
            a[i]=z.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
        }
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
