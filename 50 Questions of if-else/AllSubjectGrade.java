
// this program check grande given all subject marks
import java.util.*;
public class AllSubjectGrade {

    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the math's numbers:");
        int math=obj.nextInt();

        System.out.println("Enter the english's numbers:");
        int english=obj.nextInt();

        System.out.println("Enter the EVS's numbers:");
        int EVS=obj.nextInt();

        System.out.println("Enter the Science's numbers:");
        int Science=obj.nextInt();

        System.out.println("Enter the SST's numbers:");
        int SST=obj.nextInt();

        int marks=math+english+EVS+Science+SST;

        if(math>=33 && english>=33 && EVS>=33 && Science>=33 && SST>=33)
        {
        if(marks<=500 && marks>451)
        {
            System.out.println("Grade A+");
        }
        else if(marks<=450 && marks>=400)
        {
            System.out.println("Grage A");
        }
        else if(marks<=399 && marks>=350)
        {
            System.out.println("Grage B+");
        }
        else if(marks<=349 && marks>=300)
        {
            System.out.println("Grage B");
        }
        else if(marks<=299 && marks>=250)
        {
            System.out.println("Grage C+");
        }
        else if(marks<=249 && marks>=200)
        {
            System.out.println("Grage C");
        }
         else if(marks<=199 && marks>=145)
        {
            System.out.println("Grage D");
        }
        else if(marks<145)
        {
            System.out.println("Fail");
        }
    }
    else{
        System.out.println("You have reppear in a subject");
    }
        obj.close();
    }
}


