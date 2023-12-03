// this program create a function which increase the power of number till exponent

import java.util.*;
public class PowerOfNumber
 {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the base of number :");
        int base=obj.nextInt();

        System.out.print("Enter the exponent of number :");
        int exponent=obj.nextInt();
        
        int scan=CalculatePower(base, exponent);
        System.out.print("result is : " + scan);
        obj.close();
    }
    public static int CalculatePower(int base, int exponent)
    {
        int i=1;
        int result=1;
        while(i<=exponent)
        {
            result*=base;
            i++;
        }
        return result;
    }

}
