package Nischal.company;

import java.util.Scanner;

class RetryException extends Exception{
    public String toString(){
        return "Error";
    }
    public String getMessage(){
        return "Error";
    }
}
public class abcd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        a[4] = 4;

        int i = 1;
        while (true) {
            System.out.println("Enter the value of your index");
            int b = sc.nextInt();
            if (i < 6) {
                try {
                    System.out.println("Your value" + a[b]);
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    i++;
                    System.out.println("You have crossed limit" + i);
                }
            }
            else {
                try {
                    throw new RetryException();
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}

