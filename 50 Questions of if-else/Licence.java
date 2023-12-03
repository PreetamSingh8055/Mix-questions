// this program check puticular person eligible or not for licince
import java.util.*;
public class Licence {

    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the name : ");
        String name=obj.next();

        System.out.print("Enter the age : ");
        int age=obj.nextInt();

         System.out.print("Enter the eyesight: ");
        double eye=obj.nextDouble();
        if(eye<2.0)
        {
        if(age>=18)
        {
            System.out.println(name + " is eligible for licence ");
        }
        else
        {
            System.out.println(name + " is not eligible for licence " );
        }
    }
    else{
        System.out.println(name + " is not eligible for your weak eyesight");
    }
        obj.close();
    }
}


