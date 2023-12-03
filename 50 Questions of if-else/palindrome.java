// this program check a number is palindrome or not 
// as example number is 121 and when we get reverse it same as 121 means 121=121 is a symbol of plindrome 

import java.util.*;
public class palindrome {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in); 

        System.out.println("Enter the number :");
        int num=obj.nextInt();   // asume input as 764

        int orignalnum=num;    // store the input in another variable bacause
                               //  in end of loop the num get value zero 
        int reversenum=0;
    
        while(num!=0)           // loop get stops when num==0
        {
            int digit=num%10;                //   764%10=4
            reversenum= digit+(reversenum*10);   //  4+(0*10)=4
            num=num/10;                      //  764/10=76
        }

        System.out.println(reversenum);

        if(reversenum==orignalnum)  // we use the orignalnum for comparing 
        {
            System.out.println(orignalnum + " is a palindrome number");
            
        }
        else
        {
             System.out.println(orignalnum + " is  not a palindrome number");
            
        }
        obj.close();
    }
}
