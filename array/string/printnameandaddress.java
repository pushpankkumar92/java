//Write a prigram print name and address
package array.string;

import java.util.Scanner;

public class printnameandaddress {
    public static void main(String args[])
    {
        String name=new String();
        String address=new String();
        Scanner z=new Scanner(System.in);
        System.out.println("Enter your name");
        name=z.next();
        System.out.println("enter your address");
        address=z.next();
        System.out.println("your name="+name+"\n your address="+address);

    }
    
}
