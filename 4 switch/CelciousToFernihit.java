import java.util.*;
public class CelciousToFernihit {

    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("which reading you giving enter the checrecter 'c' for celcius  and input 'f' for farenheit !!! ");

        System.out.print("Enter the cherecter :");
        char ch=obj.next().charAt(0);

         System.out.print("Enter the reading :");
        double reading=obj.nextDouble();


        switch(ch)
        {
        case 'c':
        case 'C':
        double frenheit=((1.8*reading)+32);
        System.out.println("the frenheit reading is " +frenheit);
        break;

        case 'f':
        case 'F':
        double celcius=(5.0/9.0/(reading-32));
        System.out.println("the Celcius reading is " +celcius);
        break;
         
        }
        obj.close();
    }
}

