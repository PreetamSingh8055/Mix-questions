// this program check is given number is divisible by 3 and 4 or not

import java.util.*;
public class divisible3or4 {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the number to check is divisble by 3 and 4 or not :");
        int n=obj.nextInt();

        if(n%3==0 && n%4==0)
        {
            System.out.println(n + " is divisible by both number 3 and 4");
        }
        else
        {
            System.out.println(n + " is not divisible by both number 3 and 4");
        }
        obj.close();
    }
}
