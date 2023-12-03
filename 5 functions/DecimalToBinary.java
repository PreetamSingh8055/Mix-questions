import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the decimal number :");
        int num=obj.nextInt();
        
        int scan=convertBinary(num);
        System.out.println("the binary number is : " + scan);
        obj.close();
    }
    public static int convertBinary(int num)
    {
        if(num==0)
        {
            return 0;
        }
    
        int binaryNum=0;
        int base=1;
        while(num>0)
        {
            int remainder = num % 2;
            binaryNum = binaryNum + (remainder * base);
            num = num / 2;
            base = base * 10;
        }
    return binaryNum;

    }

}
