// this program check puticular person eligible or not for sports event
import java.util.*;
public class EligibleForSportsEvent {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the name : ");
        String name=obj.next();

        System.out.print("Enter the age : ");
        int age=obj.nextInt();

         System.out.print("Enter the gender: ");
        char gender=obj.next().charAt(0);


        if(gender=='m' || gender=='M')
        {
        if(age>=18)
        {
            System.out.println(name + " is eligible for sports event ");
        }
        else
        {
            System.out.println(name + " is not eligible for sports event " );
        }
    }
    else{
        System.out.println(name + " is not eligible for  event");
    }
        obj.close();
    }
}


