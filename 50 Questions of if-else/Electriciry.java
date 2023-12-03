// this program calculate electricity charges based on units
import java.util.*;
public class Electriciry {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the consumble units: ");
        double units=obj.nextDouble();
        
        if( units>=600 &&  units<=30000)
        {
        double bill=5*units;
            System.out.println("the  elctricity bill amount :" + bill);
        }
        else if(units<600)
        {
    
        System.out.println("you do not need to pay the bill" );
        }
        else if(units==0)
        {
            System.out.println("please check your meter other vise you get chalaan for 0 units" );
        }
        else
        {
            System.out.println("give accurate units for check the bill amount");
        }
        obj.close();
    }
    
}





