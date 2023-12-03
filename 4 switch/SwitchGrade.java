import java.util.*;

public class SwitchGrade {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the marks :");
        int n=obj.nextInt();

        switch(n/10)
        {
            case 10:
            case 9:
            System.out.println("A");
            break;

             case 8:
            System.out.println("B");
            break;

             case 7:
            System.out.println("C");
            break;

             case 6:
            System.out.println("D");
            break;

             case 5:
             case 4:
            System.out.println("E");
            break;

             default:
            System.out.println("F(Fail)");
    
        }
        obj.close();
    }
}

