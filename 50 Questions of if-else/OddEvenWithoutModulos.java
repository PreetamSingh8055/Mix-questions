// this program check odd even without using modulos operater

import java.util.*;
public class OddEvenWithoutModulos {
    public static void main(String[] args)
    {
        int n;
        Scanner Obj1 = new Scanner(System.in);

        System.out.println("enter the number:");
        n=Obj1.nextInt();
        int t=0;
        int i=1;

        while(t<=n)
        {
            t=2*i;
            if(t==n)
            {
                System.out.println(n+" is a even number");
                break;
            }
            else
            {
                i++;
            }
        }
        if(t!=n)
        {
            System.out.println(n +" is an odd number ");
        }
        Obj1.close();
    }
}
