package Nischal.company;

import java.util.Scanner;
//exception class
class negativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative";
    }
}
//method to calculate area which throws negativeRadiusException if radius is less than 0
public class nrr_throws_and_throw{
    public static double area(double radius)throws negativeRadiusException{
        if(radius<0){
            throw new negativeRadiusException();

        }
        double result = Math.PI*radius*radius;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        try {
            double ar = area(-99);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
