// this program check given person age group
import java.util.*;

public class age {
     public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the name : ");
        String name=obj.next();

        System.out.print("Enter the age : ");
        int age=obj.nextInt();

        if(age<18 && age>=13)
        {
            System.out.println(name + " is a teenager");
        }
        else if(age>=18 && age<60)
        {
            System.out.println(name + " is an adult " );
        }
        else if(age>=60 && age<=150) 
        {
            System.out.println(name + " is a senior citizen");
        }
        else if(age<13 && age>=1)
        {
            System.out.println(name + " is a children");
        }
        else
        {
            System.out.println( "please give accurate age for checking");
        }
        obj.close();
    }
    
}
