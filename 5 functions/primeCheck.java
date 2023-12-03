public class primeCheck
    {
        public static boolean primecheck(int a)
        {
            if(a<=1)
            {
                return false;
            }
            for(int i=2;i<=a/2;i++)
            {
                if(a%2==0)
                {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args)
        {
            int n=19;
            boolean isprime=primecheck(n);
            if(isprime)
            {
                System.out.println(n + " is a prime number");
            }
            else{
                System.out.println(n + " is not a prime number" );
            }

        }
    }