//Write a program of transpose matrix
package array.seconddimensionalarray;

import java.util.Scanner;

public class transposeofmatrix {
    public static void main(String args[])
    {
        int a[][]=new int[2][2];
        Scanner z=new Scanner(System.in);
        System.out.print("enter array element");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=z.nextInt();
            }
        }
        System.out.print("array matrix \n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
             System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("transpose matrix");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.print("\n");
        }
    }
    
}
