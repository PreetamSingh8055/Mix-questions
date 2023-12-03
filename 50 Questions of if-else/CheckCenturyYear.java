// this program check given year leap year or not
import java.util.*;
public class CheckCenturyYear {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the year to check  or Century year or not :");
        int n=obj.nextInt();

        if(n%400==0)
        {
            System.out.println(n + " is a Century year" );
        }

        else
        {
              System.out.println(n + " is not a Century year");
        }
        obj.close();
    }
}

