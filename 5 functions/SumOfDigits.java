public class SumOfDigits {

    public static int SumDigit(int number)
    {
        int sum=0;

        while(number!=0)
        {
          int digit=number%10;
            number=number/10;
            sum=sum+digit;
        }
        return sum;
    } 

    public static void main(String[] args)
    {
        int num=12345;
        int sum=SumDigit(num);
    
        System.out.println(sum);
    }
}
