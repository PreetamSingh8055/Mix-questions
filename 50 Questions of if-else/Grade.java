// this program check grande given marks
import java.util.*;
public class Grade {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the total numbers:");
        int marks=obj.nextInt();
        
        if(marks<=100 && marks>90)
        {
            System.out.println("Grade A+");
        }
        else if(marks<=90 && marks>=81)
        {
            System.out.println("Grage A");
        }
        else if(marks<=80 && marks>=71)
        {
            System.out.println("Grage B+");
        }
        else if(marks<=70 && marks>=61)
        {
            System.out.println("Grage B");
        }
        else if(marks<=60 && marks>=51)
        {
            System.out.println("Grage C+");
        }
        else if(marks<=50 && marks>=41)
        {
            System.out.println("Grage C");
        }
         else if(marks<=41 && marks>=33)
        {
            System.out.println("Grage D");
        }
        else if(marks<33)
        {
            System.out.println("Fail");
        }
        obj.close();
    }
}
