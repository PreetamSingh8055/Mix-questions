// this program check maxing amoung three numbers
import java.util.*;

public class MaxOfThree {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the number first:");
        int one=obj.nextInt();

        System.out.print("Enter the number second ");
        int two=obj.nextInt();

        System.out.print("Enter the number third");
        int three=obj.nextInt();

        if(one>two && one>three)
        {
            System.out.println(one + " is a largest number");
        }
        else if(two>one && two>three)
        {
            System.out.println(two + " is a lagest number");
        }
        else if(three>one && three>two)
        {
            System.out.println(three + " is a largest number");
        }
        else
        {
            System.out.println("we not compaire similar numbers");
        }
        obj.close();
    }

}
