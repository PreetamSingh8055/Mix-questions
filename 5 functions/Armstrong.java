import java.util.*;
public class Armstrong 
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the number for checking armstrong or not:");
        int num=obj.nextInt();
        if(num>=1000 || num<=99)
        {
            System.out.println("please enter the number of three digits");
        }
        
        boolean scan=checkArmstrong(num);
        System.out.println("the result is : " + scan);
        obj.close();
    }
    public static boolean checkArmstrong(int num)
        {
            int digit;
            int orignalnum=num;
            int result=0;
            while(num!=0)
            {
                digit=num%10;
                result=result+(digit*digit*digit);
                num=num/10;
            }
            if(orignalnum==result)
            {
                return true;
            }
            else
            {
                return false; 
            }
        }

}
