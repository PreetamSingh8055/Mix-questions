// this program check triangle basis of given sides
import java.util.*;
public class CheckTriangleBySides {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the angle one:");
        int side_one=obj.nextInt();

         System.out.print("Enter the angle two:");
        int side_two=obj.nextInt();

         System.out.print("Enter the angle three :");
        int side_three=obj.nextInt();
        
        if(side_one==side_two && side_two==side_three && side_three==side_one )
        {
            System.out.println("Triangle is a  Equilateral tringle");
        }
        else if( side_one==side_two || side_two==side_three || side_three==side_one)
        {
            System.out.println("Trangle is a Isosceles triangle");
        }
        else
        {
            System.out.println("Trangle is a Scalene triangle");
        }
        obj.close();
    }
}


