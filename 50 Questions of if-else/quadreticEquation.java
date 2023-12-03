// this program find the quardretic equation of root
import java.util.*;
public class quadreticEquation {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the number :");
        int a=obj.nextInt();
        System.out.print("Enter the number :");
        int b=obj.nextInt();
        System.out.print("Enter the number :");
        int c=obj.nextInt();

        double firstroot, secondroot;

         int det=b*b - 4*a*c;
        double sqrt=Math.sqrt(det);


        if(det>0)
        {
            firstroot=(-b+sqrt)/(2*a);
            secondroot=(-b-sqrt)/(2*a);
            System.out.format("first root =%.2f and second root=%.2f ", firstroot,secondroot);
        }
        else if(det==0)
        {
            firstroot=secondroot=(-b/2*a);
            System.out.format("first root and second root =%.2f", firstroot);
        }
        else
        {
            double real = -b / (2 * a);
 
            double imaginary = -sqrt/ (2 * a);
 
            System.out.printf("First Root = %.2f+%.2fi",
                              real, imaginary);
            System.out.printf("\nSecond Root = %.2f-%.2fi",
                              real, imaginary);
        }
        obj.close();
    }
}
