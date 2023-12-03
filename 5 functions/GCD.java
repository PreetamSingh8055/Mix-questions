import java.util.*;
public class GCD 
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the number a :");
        int a=obj.nextInt();

        System.out.print("Enter the number b :");
        int b=obj.nextInt();
        
        int scan=commondivisor( a, b);
        System.out.println("the common divisor is " + scan );
        obj.close();
    }
    public static int commondivisor(int a, int b)
    {
        
        int temp;
        while(b!=0)
        {
            temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

}
