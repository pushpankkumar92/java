//write a program to find vowel and consonent by using string
package array.string;

import java.util.Scanner;

public class vowel {
    public static void main(String args[])
    {
        int i,vow=0,cons=0;
        String s=new String();
        Scanner z=new Scanner(System.in);
        System.out.println("enter string");
        s=z.nextLine();
        s=s.toUpperCase();
        for(i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c!=' ')
            {
                if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                vow++;
                else
                cons++;
            }
        }
    }
    
}
