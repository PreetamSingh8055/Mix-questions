import java.util.*;

public class CostOfProduct {

    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);


        System.out.print("Enter the product name as(rise/daal/chips/almound) :");
        String product=obj.next().toLowerCase();

        System.out.print("Enter the quantity :");
        int quantity=obj.nextInt();
        
        int cpu=0;
        int totalcost=0;

        switch(product)
        {
        case "rise":
        cpu=100;
        totalcost=cpu*quantity;
        System.out.println("the total cost of rise is " + totalcost );
        break;

        case "daal":
        cpu=50;
        totalcost=cpu*quantity;
        System.out.println("the total cost of daal is " + totalcost );
        break;

         case "chips":
        cpu=20;
        totalcost=cpu*quantity;
        System.out.println("the total cost of chips is " + totalcost );
        break;

        case "almound":
        cpu=450;
        totalcost=cpu*quantity;
        System.out.println("the total cost of almound is " + totalcost );
        break;


        }
        obj.close();
    }
}

