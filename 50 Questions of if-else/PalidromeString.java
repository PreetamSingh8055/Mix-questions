// this program check is given string is palidrone or not

import java.util.*;
public class PalidromeString {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the string to check plindrome or not : ");
        String pali=sc.nextLine();

        if(palidrome(pali))
        {
            System.out.println(pali + " is a plaidrome string ");
        }
        else
        {
            System.out.println(pali + " is not a palidorme string ");
        }
        obj.close();
    }
    public static boolean palidrome(String str)
    {
        int left=0;
        int right=str.length()-1;
        while(right>left)
        {
            if( str.charAt(left)!=str.charAt(right))
            {
                return false;
            }
            left++;
            right--;

        }
        return true;
        
        
    }
}
