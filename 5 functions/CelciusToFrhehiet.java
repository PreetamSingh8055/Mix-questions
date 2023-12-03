import java.util.*;
public class CelciusToFrhehiet
 {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the celcius reading :");
        int n=obj.nextInt();
        
        double change=convertIntof(n);
        System.out.println("the fahrenheit reading is :" + change);
        obj.close();
    }

    public static double convertIntof(int num)
    {
       double ferenheit=(num*9/5)+32;
       return ferenheit;
    }
}
