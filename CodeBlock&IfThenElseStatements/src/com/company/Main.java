//->CodeBlock & If Keyword
package com.company;
public class Main
{
    public static void main(String[] args)
    {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        if(score < 5000 && score > 1000)
        {
            System.out.println("Your score was less than 5000");
        }
        else if(score < 1000)
        {
            System.out.println("Your score was less than 1000");
        }
        else
        {
            System.out.println("Got here");
        }

        if (gameOver = true)
        {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your Score is " + finalScore);
            //cannot use finalScore outside this code block
        }

//challenge
/*        boolean newGameover = true;
        int newScore = 10000;
        int newLevelcompleted = 8;
        int newBonus = 200;
        if (newGameover = true)
        {
            int finalScore = newScore + (newLevelcompleted * newBonus);
            System.out.println("Your Score is " + finalScore);
            //cannot use finalScore outside this code block
        }
        or we can use the previously used variables
*/
        score=10000;
        levelCompleted=8;
        bonus=200;
        if (gameOver = true)
        {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your Score is " + finalScore);
            //cannot use finalScore outside this code block
        }



    }
}
