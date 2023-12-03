
    // this program check is given number is divisible by 4 and 5 or not

import java.util.*;
public class divisible4or5 {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the number to check is divisble by 4 and 5 or not :");
        int n=obj.nextInt();

        if(n%4==0 && n%5==0)
        {
            System.out.println(n + " is divisible by both number 4 and 5");
        }
        else
        {
            System.out.println(n + " is not divisible by both number 4 and 5");
        }
        obj.close();
    }
}
