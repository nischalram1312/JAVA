package Nischal.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        InputCalculator.inputThenPrintSumAndAverage();
    }
    /*public static void input()
    {
        Scanner scanner = new Scanner(System.in);
        int sum=0, count=0;
        double average=0;
        while(scanner.hasNextInt()==true)
        {
            int number = scanner.nextInt();
            sum = sum + number;
            count++;
            average = (double)sum/(double)count;
            average = Math.round(average);
            break;
        }
        System.out.println("sum ="+sum+" avg ="+average);
        scanner.close();
    }*/
}



