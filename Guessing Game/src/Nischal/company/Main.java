package Nischal.company;
import java.util.Scanner;
import java.util.Random;
class Game {
    public int number;
    public int inputNumber;
    public int numberOfGuesses=0;
    public Game() {
        Random ra = new Random();
        this.number = ra.nextInt(100);
    }

    int userInput(){
        System.out.println("guess the number");
        Scanner sc = new Scanner(System.in);
        this.inputNumber=sc.nextInt();
        return inputNumber;
    }

    boolean isCorrect(){
        numberOfGuesses++;
        if(inputNumber==number){
            System.out.format("You got it right, the number is %d This is your %dth attempt",number,numberOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("too low");
        }
        else if(inputNumber>number){
            System.out.println("too high");
        }
        return false;
    }
}


public class Main {

    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b) {
            g.userInput();
            b = g.isCorrect();
        }
    }
}
