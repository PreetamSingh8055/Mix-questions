import java.util.*;
public class checkcherecter {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
    
        System.out.println("Enter the cherecter:");
        char ch =obj.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println(ch + " is a vowel");
        }
        else 
        {
            System.out.println(ch + " is a cousunet");
        }
        obj.close();
    }
    
}
