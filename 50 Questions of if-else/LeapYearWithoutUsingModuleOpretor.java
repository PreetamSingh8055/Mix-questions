// this program check leap year or not

import java.util.*;
public class LeapYearWithoutUsingModuleOpretor {
    public static void main(String[] args)
    {
    Scanner obj=new Scanner(System.in);

        System.out.println("Enter the year to check leap or not :");
        int n=obj.nextInt();
        int quotient1=n/4;
        int quotient2=n/100;
        int quotient3=n/400;

        if(((quotient1*4==n) && (quotient2*100!=n)) || (quotient3*400==n))
        {
        
            
            System.out.println(n + " is a leap year" );
        
           
        }
          else
        {
              System.out.println(n + " is not a leap year");
        }

       
        obj.close();
}
}
