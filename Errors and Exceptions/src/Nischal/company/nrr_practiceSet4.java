package Nischal.company;

import java.util.Scanner;

class outOfBoundException extends Exception{
    @Override
    public String toString() {
        return "Error";
    }
    @Override
    public String getMessage() {
        return "Error";
    }
}

public class nrr_practiceSet4 {
    public static void main(String[] args) {
        int i=0;
        int index;
        int [] marks = new int[4];
        marks[0]=99;
        marks[1]=98;
        marks[2]=97;
        marks[3]=96;
        Scanner sc = new Scanner(System.in);
        while (true ) {
            System.out.println("Enter an index value");
            if (i < 4) {
                try {
                    index = sc.nextInt();
                    System.out.println("marks of entered index is " + marks[index]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("!!!!!!!!!!invalid input!!!!!!!!!!");
                    System.out.println(e);
                    i++;
                }
            }
            else{
                try{
                    throw new outOfBoundException();
                }
                catch (Exception e){
                    System.out.println(e);
                    break;

                }
        }

        }

    }
}

