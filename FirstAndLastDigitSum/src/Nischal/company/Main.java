package Nischal.company;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("The sum of  first and last digit is "+sumFirstAndLastDigit(156));
        System.out.println("The sum of  first and last digit is "+sumFirstAndLastDigit(5));
    }

    public static int sumFirstAndLastDigit(int number)
    {
        int lastDigit = 0;
        int firstDigit = 0;
        firstDigit=number;
        if(number >= 0)
        {
            if(number>=10)
            {
                lastDigit = number % 10;
                while (firstDigit >= 10) {
                    firstDigit = firstDigit / 10;
                }

                System.out.println("First Number " + firstDigit + " Last Number " + lastDigit + " Total = " + (firstDigit + lastDigit));
            }
            else
            {
                lastDigit=firstDigit;
            }
            return firstDigit + lastDigit;

        }
        else
        {
            System.out.println("-1");
            return -1;
        }
    }
}
