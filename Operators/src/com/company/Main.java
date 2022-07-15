/*
->Operators
operators are specials symbols which perform specific operations on one, two or three operands.
Operand is a term used to describe any object that is manipulated by the operator.
Expression is formed by combining variables, literals, method return values and operators.
*/

package com.company;
public class Main
{
    public static void main(String[] args)
    {
        int result = 1+2; //1+2=3
        System.out.println(" 1 + 2 ="+result);
        int previousResult = result;
        System.out.println("previousResult ="+previousResult);
        result = result -1;//3-1=2
        System.out.println(" 3 - 1="+result);
        System.out.println("previousResult ="+previousResult);
        result = result*10;
        System.out.println("2 * 10 ="+result);
        result=result/5;
        System.out.println("20 / 5="+result);
        result=result%3;
        System.out.println("4 % 3 ="+result);

        result++;//1+1=2
        System.out.println("1 + 1 ="+result);
        result--;//2-1=1
        System.out.println("2 - 1 ="+result);
        result += 2;//1+2=3
        System.out.println("1 + 2 ="+result);
        result *=10;//3*10=30
        System.out.println("3 * 10 ="+result);
        result /= 3;//30/3=10
        System.out.println("30 / 3 ="+result);

//if then statement
        boolean isAlien = false;
        if (isAlien == false)
         {
            System.out.println("it is not an alien");
            System.out.println("i am jadoo");
         }
        System.out.println("i am");

        int topScore = 100;
        if(topScore!=100)
        {
            System.out.println("you are the top scorer");
        }
        else
        {
            System.out.println("You are not a top scorer");
        }

        int score=99;
        if(score <= 99 && score >= 95)
        {
            System.out.println("you are in the 100th percentile");
        }
        else
        {
            System.out.println("you are not among the 100 percentile");
        }

        int marks =99;
        if((marks <= 80) || (marks >= 60))
        {
            System.out.println("you are in the 90th percentile");
        }
        else
        {
            System.out.println("you are not among the 90th percentile");
        }

        int newValue = 50;
        if(newValue == 50)
        {
            System.out.println(newValue);
        }

        boolean isCar = true;
        if(isCar == true)
        {
            System.out.println("is car is true");
        }

        boolean wasCar= isCar ? true : false;
        if( wasCar == true)
            {
            System.out.println("Was car is true");
            }


//challenge
        double number=20.00d;
        double number2=80.00d;
        double sum=number+number2;
        double product=sum*100.00d;
        double remainder = product % 40.00d;
        boolean isNoRemainder = (remainder == 0) ? true:false;
        System.out.println("remainder "+remainder);
        if(remainder!=0)
        {
            System.out.println("Got some remainder");
        }



    }


}



