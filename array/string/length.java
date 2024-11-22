//Write a program to print length of string
package array.string;

import java.util.Scanner;

public class length {
    public static void main(String args[])
    {
        int len,i;
        String s=new String();
        Scanner z=new Scanner(System.in);
        System.out.println("enter string");
        s=z.nextLine();
        len=s.length();
        for(i=0;i<len;i++)
        System.out.println(s.charAt(i));
    }

    
}
