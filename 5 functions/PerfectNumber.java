import java.util.*;
public class PerfectNumber 
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the number for checking perfect number or not :");
        int n=obj.nextInt();
        
        boolean scan=checkPerfect(n);
        System.out.println("the result is : " + scan);
        obj.close();
    }
    public static boolean checkPerfect(int num)
    {
        int i=1;
        int sum=0;
        while(i<num)  //if we put the i<=num then it show false because it als take 6 then 6=1+2+3+6  show false
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
            i++;
        }
            return num==sum;
       
    }

}
