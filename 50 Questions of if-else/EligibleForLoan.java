// this program check person is eligible for loan or not 
import java.util.*;
public class EligibleForLoan {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the name :");
        String name=obj.nextLine();

        System.out.println("Enter the monthly salary amount :");
        int sal=obj.nextInt();

        System.out.println("Enter the credit score :");
        int credit=obj.nextInt();
        if(sal>=20000)
        {
        if(credit<=900 && credit>=700)
        {
            System.out.println(name + " is eligible for loan");
        }
        else
        {
            System.out.println(name + " is not eligible for loan because of less credit score");
        }
    }
    else{
            System.out.println(name + " is  not eligible for loan because of less monthly salary");
    }
    }
}
