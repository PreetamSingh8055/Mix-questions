// this program check given number is power of 2 or not
// means let asume we given number 16 and we check 2*2*2*2=16 and we do this thing without loop

import java.util.*;
public class CheckPowerOfTwo {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the number :");
        int n=obj.nextInt();

        if((n>0) && ((n & ( n-1 )) == 0))
        {
            System.out.println(n + " is a power of 2");
        }
        else 
        {
            System.out.println(n + " is not a power of 2");
        }
        obj.close();
   }
}
