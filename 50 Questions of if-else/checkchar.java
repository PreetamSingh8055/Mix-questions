//check the cherecter is Uppercase or lowercase and numeric

import java.util.*;
public class checkchar {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the number for checking :");
        char ch=obj.next().charAt(0);

        if(ch>='a' && ch<='z')
        {
            System.out.println(ch + " is a lowercase cherecter");
        }
        else if(ch>='A' && ch<='Z')
        {
            System.out.println(ch + " is a Uppercase cherecter");
        }
        else if(ch>='0' && ch<='9')
        {
            System.out.println(ch + " is a numeric value");
        }
        else
        {
            System.out.println(ch + " is a special symbol");
        }
        obj.close();
    }   
}
