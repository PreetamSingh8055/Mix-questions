//check the cherecter is digets  or cherecter

import java.util.*;
public class CheckDigestOrChar {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the number for checking :");
        char ch=obj.next().charAt(0);

        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
        {
            System.out.println(ch + " is a cherecter");
        }
        
        else if(ch>='0' && ch<='9')
        {
            System.out.println(ch + " is a Diget");
        }
        else
        {
            System.out.println(ch + " is a special symbol");
        }
        obj.close();
    }   
}


