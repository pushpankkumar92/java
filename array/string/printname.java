//write a program to print name in string
package array.string;

import java.util.Scanner;

public class printname {
    public static void main(String args[])
    {
        String name=new String();
        Scanner z=new Scanner(System.in);
        System.out.println("enter your name");
        name=z.next();
        System.out.println("Hello "+name);

    }
    
}
