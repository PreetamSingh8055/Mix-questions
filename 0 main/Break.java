import java.util.*;
public class Break {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number where you stop the loop:");
        int n=obj.nextInt();

        for(int i=0;i<n;i++)
        {
            System.out.println(i);
            if(i==n)
            {
                break;
            }
        }
        obj.close();
    }
}
