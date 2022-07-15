//->Methods
package com.company;
public class Main {

    public static void main(String[] args)
    {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        calculateScore(gameOver,score,levelCompleted,bonus);
        //or
        int highScore=calculateScore(true,10000,8,200);
        System.out.println("High score = "+highScore);
        //final score value is returned and stored in highScore variable
    }
//creating a method with void not returning information but datatypes like int return data
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
    {
        if (gameOver = true)
        {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
           //cannot use finalScore outside this code block
            return finalScore;
        }
        else
        {
            return -1;
            //-1 is conventionally used to indicate an error
        }
    }
}
