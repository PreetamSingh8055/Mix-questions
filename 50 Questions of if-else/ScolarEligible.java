// this program check puticular person eligible for scolership or not 
import java.util.*;
public class ScolarEligible {

    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the name : ");
        String name=obj.next();

        System.out.print("Enter the current semester marks : ");
        int marks=obj.nextInt();

         System.out.print("Enter the anual income : ");
        int income=obj.nextInt();


        if(marks>=350 && income<=250000)
        {
            System.out.println(name + " is eligible for scholership");
        }
        else
        {
            System.out.println(name + " is not eligible for scholership" );
        }
  
        obj.close();
    }
}




