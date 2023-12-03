// in this program we check given divisible by both 2 and 3
import java.util.*;
public class checkdivisible {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("enter the number who want to check :");
        int n=obj.nextInt();

        if(n%2==0 && n%3==0)
        {
            System.out.println(n + " is divisible by both 2 and 3");
        }
        else{
            System.out.println(n + " is not divisible by 2 and 3");
        }
        obj.close();
}
}

