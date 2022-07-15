package Nischal.company;

import java.util.Scanner;

class myException extends Exception{
    @Override
    public String toString() {
        return "I am toString\n";
    }

    @Override
    public String getMessage() {
        return "I am getMessage\n";
    }
}
public class nrr_Exception_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 99){
            try {
                throw new myException();
//                throw new ArithmeticException("This is a numerical exception");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
//                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("aaaaaaa");
            }
        }
    }
}
