package com.company;
public class Main {
    public static void main(String[] args) {
        System.out.println("10000 at 2% interest = " + calculateInterest(10000.0,2.0));
        System.out.println("10000 at 3% interest = " + calculateInterest(10000.0,3.0));
        System.out.println("10000 at 4% interest = " + calculateInterest(10000.0,4.0));
        System.out.println("10000 at 5% interest = " + calculateInterest(10000.0,5.0));
        System.out.println("10000 at 6% interest = " + calculateInterest(10000.0,6.0));
        /*for(int i=0;i<=9;i++) {
            System.out.println("10000 at "+i+"% interest = "+String.format("%.2f",calculateInterest(10000.0,i)));*/
            int count = 0;
            for (int i=0; i<100 ; i++){
                if(isPrime(i)==true){
                    count++;
                    System.out.println("Number "+i+" is a prime number");
                    if(count==24){
                        System.out.println("Exiting Loop");
                        break;
                    }
                }
        }
            System.out.println("The number of prime numbers is "+count);

    }
    public static double calculateInterest(double amount, double interest) {
        return (amount*(interest/100));
    }
    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        for(int i=2; i<=n/2 ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
