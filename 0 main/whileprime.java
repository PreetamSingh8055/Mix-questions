// find prime number using while loop
import java.util.*;
public class whileprime {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the number you want to check prime or not :");
        int n=obj.nextInt();
        int i=2;
        while(n>i)
        {
            if(n%i==0)
            {
                System.out.println( n + " is not a prime number");
                break;
            }
             else if(i==n-1)
            {
                System.out.println(n + " is a prime number");
                break;
            }
            else
            {
                i++;
            }
        }
    }
}
