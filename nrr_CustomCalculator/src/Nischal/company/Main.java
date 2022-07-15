package Nischal.company;

class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "Cannot compute cannot calculate with 8 or 9 as inputs";
    }

    @Override
    public String getMessage() {
        return "Invalid Input";
    }
}
class CannotDivideByZero extends Exception{
    @Override
    public String toString() {
        return "Cannot compute, cant divide by 0";
    }

    @Override
    public String getMessage() {
        return "Invalid Input";
    }
}

class CustomCalculator {
    double add (double a, double b) throws InvalidInputException{
        if(a==9||b==9||a==8||b==8){
            throw new InvalidInputException();
        }
        return a+b;
    }
    double subtract(double a, double b)throws InvalidInputException{
        return a-b;
    }
    double multiply(double a, double b) throws InvalidInputException{
        return a*b;
    }
    double divide(double a, double b) throws CannotDivideByZero {
        if(b==0){
            throw new CannotDivideByZero();
        }
        return a/b;
    }
}

public class Main {
    public static void main(String[] args) throws InvalidInputException, CannotDivideByZero {
        CustomCalculator c = new CustomCalculator();
        double x= c.divide(9,0);
        System.out.println(x);
    }
}
