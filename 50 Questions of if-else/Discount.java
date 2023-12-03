// this program calculate commsion based on amount
import java.util.*;
public class Discount {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the purchasing amount: ");
        double purchases=obj.nextDouble();
        
        if( purchases<=10000)
        {
        double discount=purchases*5/100;
            System.out.println("the  discount amount :" + discount);
        }
        else if(purchases<=100000)
        {
        double discounttwo=purchases*10/100;
        System.out.println("the discount amount :" + discounttwo);
        }
        else
        {
            double discountthree=purchases*20/100;
            System.out.println("the comission amount : " + discountthree);
        }
        obj.close();
    }
    
}



