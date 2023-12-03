import java.util.*;
public class AreaOfCircle
 {

    public static double CircleArea(double r)
    {
        double area=Math.PI*r*r;
        return area;
    }

    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the radius of circle :");
        int  num=obj.nextInt();
        
        double area=CircleArea(num);

        System.out.println("area of circle is :" + area);
        obj.close();
    }

}
