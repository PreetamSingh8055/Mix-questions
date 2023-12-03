// this program check perfect number or not
import java.util.*;
public class PerfectNumber {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the number :");
        int n=obj.nextInt();
        int sum=0;

        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }

        if(sum==n)
        {
            System.out.println(n + " is a perfect square");
        }
        else
        {
            System.out.println(n + " is not a perfect square");
        }
        obj.close();
    }
}

