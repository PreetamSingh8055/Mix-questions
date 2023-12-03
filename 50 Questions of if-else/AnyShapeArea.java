// this program find any shape area
import java.util.*;
public class AnyShapeArea {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

         System.out.println("you can find the area of circle,triangle and rectangel !! ");
       
         System.out.print("Enter the which shape you want area :");
        String shape=obj.next().toLowerCase();
        
        if(shape.equals("circle"))
        {
            System.out.print("Enter the radius of circle: ");
            int radius=obj.nextInt();

            double circlearea=Math.PI*radius*radius;

            System.out.println("the area of circle:" + circlearea);
        }
         else if(shape.equals("triangle"))
        {
            System.out.print("Enter the height of triangle: ");
            int height=obj.nextInt();

             System.out.print("Enter the base of triangle: ");
            int base=obj.nextInt();

            double trianglearea=(height*base)/2;

            System.out.println("the area of triangle:" + trianglearea );
        }
         else if(shape.equals("rectangle"))
        {
            System.out.print("Enter the length of rectangle: ");
            int lenght=obj.nextInt();

             System.out.print("Enter the width of rectangle: ");
            int width=obj.nextInt();

            double rectanglearea=lenght*width;

            System.out.println("the area of rectangle:" + rectanglearea );
        }
        else{
            System.out.println("Please give right input as circle , triangle and rectangle");
        }
        obj.close();
}
}