package Nischal.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int numberOfGuesses=0;

    Game() {
        Random ra = new Random();
        number = ra.nextInt(100);
        }
        void takeUserInput(){
            System.out.println("Guess the number");
            Scanner sc = new Scanner(System.in);
            inputNumber=sc.nextInt();
        }
        boolean isCorrect(){
        numberOfGuesses++;
        if(inputNumber==number){
            System.out.format("You got it right the number was %d in %d attempts ",number,numberOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("too low");
        }
        else if (inputNumber>number){
            System.out.println("too high");
        }
        return false;
        }
}
public class Exercise_GuessTheGame {
    public static void main(String[] args) {
        boolean b = false;
        Game g = new Game();
        while(b!=true){
            g.takeUserInput();
            b= g.isCorrect();
        }
    }
}
