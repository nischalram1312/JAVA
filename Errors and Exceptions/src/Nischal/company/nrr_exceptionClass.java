package Nischal.company;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am To String";
    }

    @Override
    public String getMessage() {
        return "I am Get Message";
    }
}

public class nrr_exceptionClass {
    public static void main(String[] args) {
    int a =8;
        Scanner sc = new Scanner(System.in);
    if(a<sc.nextInt()){
        try {
            throw new MyException();
        }
        catch (Exception e){
            System.out.println(e);
        }
      }
    }
}
