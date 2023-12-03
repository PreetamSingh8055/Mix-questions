// this program check given number negative or positve

import java.util.*;
public class PositiveOrNegative {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the number :");
        int n=obj.nextInt();

        if(n>0)
        {
            System.out.println(n + " is a positive number");
        }
        else if(0>n)
        {
            System.out.println(n + " is a negative number");
        }
        else
        {
            System.out.println("Zero is not positive or negative nature");
        }
        obj.close();

    }
}