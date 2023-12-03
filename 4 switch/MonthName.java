import java.util.*;
public class MonthName{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=obj.nextInt();

        switch(n)
        {
            case 1:
            System.out.println("january");
            break;

             case 2:
            System.out.println("febuery");
            break;

             case 3:
            System.out.println("march");
            break;

             case 4:
            System.out.println("aprail");
            break;

             case 5:
            System.out.println("may");
            break;

             case 6:
            System.out.println("june");
            break;

             case 7:
            System.out.println("july");
            break;

             case 8:
            System.out.println("augest");
            break;

             case 9:
            System.out.println("september");
            break;

             case 10:
            System.out.println("octuber");
            break;

             case 11:
            System.out.println("nevember");
            break;

             case 12:
            System.out.println("december");
            break;

            default:
            System.out.println("invalid input ");
            break;

        }
        obj.close();
    }
}