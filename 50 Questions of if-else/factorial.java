// this program find the factorial of number
import java.util.*;
public class factorial {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the number which you want fectorial:");
        int n=obj.nextInt();
        int i;
        int f=1;
        for(i=1;i<=n;i++)
        {
            
            f=f*i;
        }
        System.out.println("fectorial of " + n + " is :" + f );
        obj.close();
    }
    
}
