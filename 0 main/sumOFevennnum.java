//sum of even numbers till that given number
import java.util.*;
public class sumOFevennnum {
    public static void main(String[] args)
    {
        int sum=0;
    Scanner obj=new Scanner(System.in);

    System.out.println("Enter the number till you want sum of even numbers: ");
    int n=obj.nextInt();
int i=1;
    while(i<=n)
    {
        if(i%2==0)
        {
            sum=sum+i;
            i++;
        }
        else{
            i++;
        }
    }
    System.out.println("Sum of all even numbers till " + n + " is " + sum);
    obj.close();
    }

}
