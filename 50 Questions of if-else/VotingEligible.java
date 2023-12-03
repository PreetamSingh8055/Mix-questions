// this program check puticular person eligible or not
import java.util.*;
public class VotingEligible {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the name : ");
        String name=obj.next();

        System.out.print("Enter the age : ");
        int age=obj.nextInt();

        if(age>=18)
        {
            System.out.println(name + " is eligible for voting ");
        }
        else
        {
            System.out.println(name + " is not eligible for voting " );
        }
        obj.close();
    }
}
