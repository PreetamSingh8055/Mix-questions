// this program check puticular person eligible for discount or check mebership
import java.util.*;
public class EligibleForDiscount {

    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the name : ");
        String name=obj.next();

        System.out.print("Enter the age : ");
        int age=obj.nextInt();

         System.out.print("Have you membership or not (y/n) ?: ");
        char membership=obj.next().charAt(0);


        if((membership=='y' || membership=='Y' )  &&   (membership!='N' || membership!='n'))
        {
        if(age>=18)
        {
            System.out.println(name + " is eligible for Discount ");
        }
        else
        {
            System.out.println(name + " is not eligible for Discount " );
        }
    }
    else{
        System.out.println(name + " is not eligible for  Discount because there no membership");
    }
        obj.close();
    }
}

