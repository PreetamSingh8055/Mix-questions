import java.util.*;
public class checkmaximum {
    public static void main (String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the first number :");
        int a=obj.nextInt();

        System.out.print("Enter the second number :");
        int b=obj.nextInt();

        if(a>b)
        {
            System.out.println(a + " is a bigest number");
        }
        else if(a<b)
        {
            System.out.print(b + "  is a bigest number");
        }
        else
        {
            System.out.println("we cannot compaire equal number");
        }
        obj.close();
    }
    
}
