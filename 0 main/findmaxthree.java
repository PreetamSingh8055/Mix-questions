import java.util.*;
public class findmaxthree {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("enter the number first:");
        int a=obj.nextInt();

        System.out.println("Enter the number second:");
        int b=obj.nextInt();

        System.out.println("Enter the number third: ");
        int c=obj.nextInt();

        if(a>b && a<c)
        {
            System.out.println(a + " is a biggest number");
        }
         else if(b>a && b>c)
        {
            System.out.println(b + " is a biggest number");
        }
        else if(c>a && c>b)
        {
            System.out.println(c + " is a biggest number");
        }         
        else
        {
            System.out.println("two and three number are same");
        }
        obj.close();

    }
}
