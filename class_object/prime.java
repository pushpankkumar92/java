package class_object;

import java.util.Scanner;

public class prime {
    int n;
    void getdata()
    {
        Scanner z=new Scanner(System.in);
        System.out.println("enter a no");
        n=z.nextInt();
    }
    void putdata()
    { 
        int i,count=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
                 count=count+1;
        }
        if(count==2)
        System.out.println("prime");
        else
        System.out.println("not prime");
    }
    public static void main(String args[])
    {
        prime aa=new prime();
        aa.getdata();
        aa.putdata();
    }
}
