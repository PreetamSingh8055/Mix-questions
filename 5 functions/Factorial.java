import java.util.*;
public class Factorial
 {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the number :");
        int num=obj.nextInt();
        
        int scan=FindFactorial(num);
        System.out.print("the factorial is : " + scan);
        obj.close();
    }

    public static int FindFactorial(int n)
    {
        int f=1;
        int i=1;
        while(i<=n)
        {
            f=f*i;
            i++;
        }
        return f;
    }
}
