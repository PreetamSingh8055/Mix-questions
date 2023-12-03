// this program check puticular person eligible for job
import java.util.*;
public class EligibleForJob {

    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the name : ");
        String name=obj.next();

        System.out.print("Enter the experince : ");
        int experince=obj.nextInt();

         System.out.print("Enter the qualification: ");
        String qualification=obj.next().toLowerCase();

        if( qualification.equals("bca") ||  qualification.equals("mca"))
        {
        if(experince>=1)
        {
            System.out.println(name + " is eligible for job ");
        }
        else
        {
            System.out.println(name + " is not eligible for job " );
        }
    }
    else{
        System.out.println(name + " is not eligible for Job");
    }
        obj.close();
    }
}




