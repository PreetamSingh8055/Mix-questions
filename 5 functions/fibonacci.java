import java.util.*;
public class fibonacci 
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the nth number :");
        int n=obj.nextInt();
        
        int scan=findfibonacci(n);
        System.out.println(scan);
        obj.close();
    }
    public static int findfibonacci(int n)
    {
        int a=0;
        int b=1;
        int i=3;
        int temp;
        System.out.print( a + " " + b + " " );
        while(i<=n)
        {
            temp=b;
            b=a+b;
            System.out.print( b + " " );
            a=temp;
            i++;
        }
        System.out.println(" ");
        System.out.print(" the " + n + "th term is :");
        return b;
    }

}
