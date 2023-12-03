// this program check is given number is divisible by 5 and 7 or not

import java.util.*;
public class divisible5or7 {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the number to check is divisble by 5 and 7 or not :");
        int n=obj.nextInt();

        if(n%5==0 && n%7==0)
        {
            System.out.println(n + " is divisible by both number 5 and 7");
        }
        else
        {
            System.out.println(n + " is not divisible by both number 5 and 7");
        }
        obj.close();
    }
}
