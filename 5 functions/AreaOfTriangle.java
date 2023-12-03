import java.util.*;
public class AreaOfTriangle 
{
        
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the base :");
        int b=obj.nextInt();
        System.out.print("Enter the height :");
        int h=obj.nextInt();
        double area=TriangleArea(b, h);
        System.out.println("area of triangle :" + area);
        obj.close();
    }

    public static double TriangleArea(int b, int h)
    {
        double area=(b*h)*1/2;
        return area;
    }
}
