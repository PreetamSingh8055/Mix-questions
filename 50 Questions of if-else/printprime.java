import java.util.*;
public class printprime {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        
        System.out.println("Enter the number which you want to chech prime :");
        int n=obj.nextInt();
        int i=2;
        if(n%i==0)
        {
            for(;i<n;i++)
            {
                System.out.println(n + " is not a prime number");
                break;
            }
         }
        else
        {
                System.out.println(n + " is a prime number");
        }
            
            
        obj.close();
    }
}
