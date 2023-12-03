// this program check given cherecter Vowel or Consonant
import java.util.*;
public class VowelOrConsonant {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the cherecter to check :");
        char ch=obj.next().charAt(0);

        if(ch=='a' || ch=='A'|| ch=='e' || ch=='E' || ch=='i' ||ch=='I' || ch=='o' || ch=='O' || ch=='u'|| ch=='U')
        {
            System.out.println(ch + " is a Vowel");
        }
        else{
            System.out.println( ch + " is a Consonant ");
        }
        obj.close();
    }
}
