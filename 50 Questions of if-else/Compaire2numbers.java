// this program check two number who max
import java.util.*;
public class Compaire2numbers {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the number one : ");
        int one=obj.nextInt();

        System.out.print("Enter the number two : ");
        int two=obj.nextInt();

        if(one>two)
        {
            System.out.println(one + " is a greater then "+ two);

        }
        else if(two>one)
        {
            System.out.println(two + " is a greater then " + one);
        }
        else
        {
            System.out.println("we can't compaire both numbers are equal ");
        }
        obj.close();
    }
}
