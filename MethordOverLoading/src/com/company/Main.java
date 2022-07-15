package com.company;

public class Main {
    public static void main(String[] args)
    {
        int newScore = calculateScore("ram", 500);
        System.out.println("score is " + newScore);
        int overLoadedScore = calculateScore(400);
        System.out.println("overloaded score is " + overLoadedScore);
        int overLoadedScore1 = calculateScore();
        System.out.println("overloaded score2 is " + overLoadedScore1);
        calcFeetAndInchesToCentimeters(6,0);
        calcFeetAndInchesToCentimeters(157);

    }

    public static int calculateScore(String playerName, int score)
    {
        System.out.println("player" + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score)
    {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore()
    {
        System.out.println("Unnamed player scored  points");
        return 0;
    }

    //->challenge
    public static double calcFeetAndInchesToCentimeters(double feet, double inches)
    {
        if((feet<0) || ((inches<0) || (inches>12)))
        {
            System.out.println("invalid parameters");
            return -1;
        }
        else
        {
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + " feet" + inches + " inches" + centimeters + " cm");
            return centimeters;
        }

    }

    public static double calcFeetAndInchesToCentimeters(double inches)
    {
        if(inches<0)
        {
            return -1;
        }
        else
        {
            double numberOfFeet=(int)inches/12;
            double remainingInches=(int)inches%12;
            calcFeetAndInchesToCentimeters(numberOfFeet,remainingInches);
            System.out.println(inches+"inches is equal to "+numberOfFeet+" feet and "+remainingInches);
            return numberOfFeet;
        }

    }



}