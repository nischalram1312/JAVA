package Nischal.company;
public class Main
{
    public static void main(String[] args)
    {
        numberToWords(100000);
    }
    public static void numberToWords(int number)
    {

        if(number>0)
        {
            int reversed=reverse(number);
            int originalNumberOfDigits=getDigitCount(number);
                for(int i =0;i<originalNumberOfDigits;i++)
                {
                    int digit=reversed%10;
                    switch (digit)
                    {
                        case 0:
                            System.out.println("zero");
                            break;
                        case 1:
                            System.out.println("one");
                            break;
                        case 2:
                            System.out.println("two");
                            break;
                        case 3:
                            System.out.println("three");
                            break;
                        case 4:
                            System.out.println("four");
                            break;
                        case 5:
                            System.out.println("five");
                            break;
                        case 6:
                            System.out.println("six");
                            break;
                        case 7:
                            System.out.println("seven");
                            break;
                        case 8:
                            System.out.println("eight");
                            break;
                        case 9:
                            System.out.println("nine");
                            break;
                        default:
                            break;
                    }
                    reversed=reversed/10;
                }
        }
        else
        {
            System.out.println("Invalid Value");
        }
    }
    //end of numberToWordsMethod
    public static int reverse(int number)
    {
        int reverse=0;
        while(number>0)
        {
            int remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;
        }
        return reverse;
    }
    //end of reverse method
    public static int getDigitCount(int number)
    {
        int numberOfDigits=0;
        int lastDigit=0;
        while(number>0)
        {
            lastDigit=number%10;
            number=number/10;
            numberOfDigits++;
        }
        return numberOfDigits;
    }
}
