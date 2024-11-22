//Write a program to find sum of two matrix
package array.seconddimensionalarray;

import java.util.Scanner;

public class sumoftwomatrix {
    public static void main(String args[])
    {
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int c[][]=new int[2][2];
        Scanner z=new Scanner(System.in);
        System.out.print("enter first matrix data");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=z.nextInt();
            }
        }
        System.out.print("enter second matrix data");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
             b[i][j]=z.nextInt();
            }
            System.out.print("first matrix \n");
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
             System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("second matrix \n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("sum of two matrix \n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
             c[i][j]=a[i][j]+b[i][j];
             System.out.print(c[i][j]+" ");
            }
            System.out.print("\n");
        }

    }
    
}
