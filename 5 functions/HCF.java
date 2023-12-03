import java.util.*;
public class HCF
 {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);

		System.out.print("Enter the first number :");
		int a=obj.nextInt();
		System.out.print("Enter the second number :");
		int b=obj.nextInt();
		System.out.print("Enter the third number :");
		int c=obj.nextInt();
		
		int scan= findHCF(a, b, c);
		System.out.println("the HCF of three numbers is : " + scan);
		obj.close();
	}
	public static int  findHCF(int a, int b, int c)
	{
		int temp;
		while(a!=0)
		{
			temp=a;
			a=b%a;
			b=temp;
		}
		while(b!=0)
		{
			temp=b;
			b=b%c;
			c=temp;
		}
		return c;
	}

}
