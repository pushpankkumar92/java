import java.util.Scanner;
public class sumofevenandproductofodddigit {
    public static void main(String args[])
    {
        int i,sum=0,pro=1,n;
        Scanner z=new Scanner(System.in);
        System.out.println("enter a no");
        n=z.nextInt();
        while(n>0)
        {
            i=n%10;
          if(n%2==0)
          sum=sum+i;
          else
          pro=pro*i;
          n=n/10;
        }
        System.out.println("sumofeven="+sum+"product="+pro);

    }
    
}
