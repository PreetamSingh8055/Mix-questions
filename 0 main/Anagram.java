import java.util.*;
public class Anagram 
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the String :");
        String var1=obj.nextLine().toLowerCase();

        System.out.print("Enter the String :");
        String var2=obj.nextLine().toLowerCase();
        
        char[] arr1=var1.toCharArray();
        char[] arr2=var2.toCharArray();

         Arrays.sort(arr1);
         Arrays.sort(arr2);

        
        if(var1.length()!=var2.length())
        {
            System.out.println("this is not anagram");
        }
        else
        {
            for(int i=0;i<var1.length();i++)
            {
                if(arr1[i]!=arr2[i])
                {
                    System.out.println("not anagram");
                    System.exit(0);
                }
            
            }
        System.out.println("this is an anagram");
        }
        obj.close();
    }

}
