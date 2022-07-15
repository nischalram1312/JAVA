package Nischal.company;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println(getLargestPrimeFactor(217));
        System.out.println(getLargestPrimeFactor(21));
        System.out.println(getLargestPrimeFactor(45));
    }

    public static int getLargestPrimeFactor(int number)
    {
        if (number >= 2)
        {
            for(int i=2;i<number;i++)
            {
                if(number%i==0)
                {
                    number=number/i;
                    i--;
                }
            }return number;
        }
        return -1;
    }
}