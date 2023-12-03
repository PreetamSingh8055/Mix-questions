import java.util.*;
public class evenodd {
    public static void main(String[] args)
    {
        int n;
        Scanner Obj1 = new Scanner(System.in);

        System.out.println("enter the number:");
        n=Obj1.nextInt();

        if(n%2==0)
        {
            System.out.println(n+" is a even number");
        }
        else
        {
            System.out.println(n+" is a odd number");
        }
        Obj1.close();
    }
}
