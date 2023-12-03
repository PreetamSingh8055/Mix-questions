import java.util.*;
public class EvenOdd 
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the number :");
        int num=obj.nextInt();
        
        String check=OddEven(num);
        System.out.println(check);
        obj.close();
    }
    public static String OddEven(int num)
    {
        if(num%2==0)
        {
            return "Even";
        }
        else
         {
            return "Odd";
        }
    }

}
