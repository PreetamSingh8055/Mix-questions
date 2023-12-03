// this program check is given number is divisible by 6 and 9 or not

import java.util.*;
public class multiple6or9 {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the number to check is divisble by 6 and 9 or not :");
        int n=obj.nextInt();

        if(n%6==0 && n%9==0)
        {
            System.out.println(n + " is divisible by both number 6 and 9");
        }
        else
        {
            System.out.println(n + " is not divisible by both number 6 and 9");
        }
        obj.close();
    }
}
