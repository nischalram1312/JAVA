package com.company;
public class Main
{
    public static void main(String[] args)
    {
        int count =0;
        int count1 =0;
        while (count < 6)
        {
            System.out.println("Count value is "+count);
            count++;
        }
        System.out.println("**************");
        /* for (int count1=1;count1<6;count1++)
        {
            System.out.println("Count Value is "+count1);
        } */
        do
        {
            System.out.println("Count value iss "+count1);
            count1++;
        }while(count1 < 6 );
        System.out.println("**************");

        int number =4;
        int finishNumber =20;
        int totalEvenNumbers=0;
        while(number<=finishNumber)
        {
            number++;
            if(!isEven(number))
            {
                continue;
            }
            else
            {
                System.out.println("Even Number " + number);
                totalEvenNumbers++;

            }
            if(totalEvenNumbers>=5)
            {
                break;
            }

        }
    }
    public static boolean isEven(int number)
    {
        if(number%2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}

