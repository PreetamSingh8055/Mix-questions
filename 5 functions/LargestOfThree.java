import java.util.*;
public class LargestOfThree
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the first number :");
        int first=obj.nextInt();

        System.out.print("Enter the second number :");
        int second=obj.nextInt();

        System.out.print("Enter the third number :");
        int third=obj.nextInt();
        
        int scan=CheckLargest(first, second, third);
        System.out.print("the larget number is :" + scan);
        obj.close();
    }

    public static int CheckLargest(int a, int b, int c)
    {
        if(a>b && a>c)
        {
            return a;
        }
        else if(b>a && b>c)
        {
            return b;
        }
        else if(c>a && c>b)
        {
            return c;
        }
        else
        {
            return 0;
        }
    }
}
