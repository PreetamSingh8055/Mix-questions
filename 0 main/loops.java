import java.util.*;
public class loops {
    public static void main(String[] args)
    {
        int n;
     Scanner obj=new Scanner(System.in);
     
     System.out.println("Enter the number:");
     n=obj.nextInt();
     
     int i;
     for(i=0;i<=n;i++)
     {
         System.out.println(i);
         obj.close();
        }
    }    
}
