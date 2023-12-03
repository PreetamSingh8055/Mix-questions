import java.util.*;
public class averageadvance {
    public static void main (String[] args)
    {
        int n;
       Scanner obj= new Scanner(System.in);

       System.out.println("Enter the number value which you want average: ");
       n=obj.nextInt();
        
       for(int i=0;i<=n;i++)
       {
        System.out.println("enter the number"+i+ ":");
        i=obj.nextInt();
    
       }
      obj.close(); 
    }
}
