package Nischal.company;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("The sum of even digits in number 147896 is "+getEvenDigitSum(147896));
    }
    public static int getEvenDigitSum(int number)
    {
        int evenDigitSum = 0;
        if(number>0)
        {
            while(number>0)
            {
                int digit = number%10;
                number=number/10;
                if(isEven(digit)==true)
                {
                    evenDigitSum=evenDigitSum+digit;
                }
            }
        }
        return evenDigitSum;
    }
    public static boolean isEven(int number)
    {
        if(number%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
