// this program check given number is perfect cube or not
import java.util.*;
public class PerfectCube {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter the number :");
        int n=obj.nextInt();

        double cuberoot=Math.cbrt(n);

        if(cuberoot==(int)(cuberoot))
        {
            System.out.print(n + " is a perfect cube");
        }
        else
         {
            System.out.print(n + " is not a perfect cube");
        }
        obj.close();
    }
}
