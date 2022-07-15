package Nischal.company;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(28));


    }
    public static boolean isPerfectNumber(int number)
    {
        int sum=0;
        if(number>=1)
        {
            for(int i=1;i<number;i++)
            {
                if(number%i==0)
                {
                    sum +=i;
                }
            }
            if(sum==number)
            {
                return true;
            }
        }
        return false;
    }
}
