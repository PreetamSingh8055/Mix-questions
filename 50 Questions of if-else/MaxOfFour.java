//this program check maximum number among four numbers
import java.util.*;
public class MaxOfFour {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("enter the number first:");
        int a=obj.nextInt();

        System.out.println("Enter the number second:");
        int b=obj.nextInt();

        System.out.println("Enter the number third: ");
        int c=obj.nextInt();

         System.out.println("Enter the number third: ");
        int d=obj.nextInt();

        if(a>b && a<c && a>d)
        {
            System.out.println(a + " is a biggest number");
        }
         else if(b>a && b>c && b>d)
        {
            System.out.println(b + " is a biggest number");
        }
        else if(c>a && c>b && c>d)
        {
            System.out.println(c + " is a biggest number");
        } 
        else if(d>a && d>b && d>c) 
        {
            System.out.println(d + " is a biggest number");
        }       
        else
        {
            System.out.println("all numbers are same");
        }
        obj.close();

    }
}


