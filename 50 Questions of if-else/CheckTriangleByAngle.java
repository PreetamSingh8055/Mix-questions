// this program check triangle basis of given angles
import java.util.*;
public class CheckTriangleByAngle {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the angle one:");
        int angle_one=obj.nextInt();

         System.out.print("Enter the angle two:");
        int angle_two=obj.nextInt();

         System.out.print("Enter the angle three :");
        int angle_three=obj.nextInt();
        
        if(angle_one==90 || angle_two==90 || angle_three==90 )
        {
            System.out.println("Triangle is a right tringle");
        }
        else if(angle_one>90 || angle_two>90 || angle_three>90 )
        {
            System.out.println("Trangle is a obtuse triangle");
        }
        else
        {
            System.out.println("Trangle is a acute triangle");
        }
        obj.close();
    }
}
