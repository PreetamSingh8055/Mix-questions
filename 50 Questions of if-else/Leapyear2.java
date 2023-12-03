// this program check leap year or not

import java.util.*;
public class Leapyear2 {
    public static void main(String[] args)
    {
    Scanner obj=new Scanner(System.in);

        System.out.println("Enter the year to check leap or not :");
        int n=obj.nextInt();

        if(n%4==0)
        {
            if( n%100!=0 || n%400==0)
            {
            System.out.println(n + " is a leap year" );
            }
           
        }
          else
        {
              System.out.println(n + " is not a leap year");
        }

       
        obj.close();
}
}
