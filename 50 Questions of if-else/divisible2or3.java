// this program check is given number is divisible by 2 and 3 or not

import java.util.*;
public class divisible2or3 {

    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the number to check is divisble by 2 and 3 or not :");
        int n=obj.nextInt();

        if(n%2==0 && n%3==0)
        {
            System.out.println(n + " is divisible by both number 2 and 3");
        }
        else
        {
            System.out.println(n + " is not divisible by both number 2 and 3");
        }
        obj.close();
    }
}

