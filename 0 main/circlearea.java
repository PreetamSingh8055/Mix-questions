import java.util.*;
public class circlearea {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the radius of circle ");
        int r=obj.nextInt();

        double area=Math.PI*r*r;
        System.out.println("The are of circle is : " + area);
   obj.close();
    }
}
