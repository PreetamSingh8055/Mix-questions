// this program calculate commsion based on amount
import java.util.*;
public class CmissionFind {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the saling amount: ");
        double sales=obj.nextDouble();
        
        if( sales<=10000)
        {
        double comission=sales*5/100;
            System.out.println("the comission amount :" + comission);
        }
        else if(sales<=100000)
        {
        double comissiontwo=sales*10/100;
        System.out.println("the comission amount :" + comissiontwo);
        }
        else
        {
            double comissionthree=sales*20/100;
            System.out.println("the comission amount :" + comissionthree);
        }
        obj.close();
    }
    
}


