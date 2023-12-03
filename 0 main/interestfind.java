import java.util.*;
public class interestfind {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the amount: ");
        double principal=obj.nextDouble();
        
        System.out.print("Enter the rate of interest: ");
        int rate=obj.nextInt();

        System.out.print("Enter time of interst in years: ");
        int time=obj.nextInt();

        double interest=principal*rate*time/100;

        System.out.println(interest);
        obj.close();
    }
    
}
