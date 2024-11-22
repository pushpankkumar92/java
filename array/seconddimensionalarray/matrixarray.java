//Write a matrix program using 2D array
package array.seconddimensionalarray;

import java.util.Scanner;

public class matrixarray {
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
        System.out.print("matrix: \n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    
}
