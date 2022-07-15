package Nischal.company;

import java.util.Scanner;

public class InputCalculator extends Main
{
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while(scanner.hasNextInt()){
            sum += scanner.nextInt();
            count++;
            // scanner.nextLine(); // not really needed because we don't need to print an alert for invalid number
        }
        System.out.println("SUM = " + sum + " AVG = " +  sum/count);
        scanner.close();
    }
}
