// this program check the number of day of given months
import java.util.*;
public class CheckMonthDays
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the number :");
        String monthname=obj.next().toLowerCase();

        switch(monthname)
        {
            case "january":
            System.out.print("31");
            break;

            case "february":
            System.out.print("28");
            break;

            case "march":
            System.out.print("31");
            break;

            case "april":
            System.out.print("30");
            break;
            case "may":
            System.out.print("31");
            break;

            case "june":
            System.out.print("30");
            break;

            case "july":
            System.out.print("31");
            break;

            case "august":
            System.out.print("31");
            break;

            case "september":
            System.out.print("30");
            break;

            case "october":
            System.out.print("31");
            break;

            case "november":
            System.out.print("30");
            break;

            case "december":
            System.out.print("31");
            break;

            default:
            System.out.println("Invalid month name");
        }
        obj.close();
    }

}