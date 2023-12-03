import java.util.*;
public class SumOfEven 
{
public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the starting point :");
        int start=obj.nextInt();

        System.out.print("Enter the ending point :");
        int end=obj.nextInt();
        
        int scan=calculateSumOfEven(start, end);
        System.out.println("the sum of even number is : " + scan);
        obj.close();
    }

    public static int calculateSumOfEven(int start, int end)
    {
        int result=0;
        while(start<=end)
        {
            if(start%2==0)
            {
                result=result+start;
            }
            start++;
        }
        return result;
    }

}
