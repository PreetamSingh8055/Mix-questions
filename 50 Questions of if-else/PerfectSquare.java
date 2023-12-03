// this program check given number perfect square or not 
import java.util.*;
public class PerfectSquare{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=obj.nextInt();

        double root=Math.sqrt(n);

        if(root==(int)root)
        {
            System.out.println( n + " is a perfect square");
        }
        else
        {
            System.out.println(n + " is not a perfect square");
        }

        obj.close();
    }
}