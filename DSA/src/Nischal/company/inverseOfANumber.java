package Nischal.company;

import java.util.Scanner;

public class inverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();
        int inverse = 0;
        int position = 0;
        int value = 0;
        while(number!=0){
            position = number % 10;
            value++;
            number = number / 10;
            inverse += (int)value*(Math.pow(10,position-1));
        }
        System.out.println(inverse);

    }
}
