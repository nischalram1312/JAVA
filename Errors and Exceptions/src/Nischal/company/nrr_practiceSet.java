package Nischal.company;

import java.util.Scanner;

public class nrr_practiceSet {
    public static void main(String[] args) {
        //problem2
//        try{
//            int a = 666/0;
//
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("HEHE");
//        }
//        catch (ArithmeticException e){
//            System.out.println("HAHA");
//        }

        //problem3
        boolean flag =true;
        int [] marks = new int[4];
            marks[0]=1;
            marks[1]=2;
            marks[2]=3;
            marks[3]=4;
            Scanner sc = new Scanner(System.in);
            int index;
            int i=0;
        while(flag&&i<4){
            try {
                index = sc.nextInt();
                System.out.println("The value of marks[index] is" + marks[index]);
                break;
            }
            catch (Exception e) {
                i++;
                System.out.println("invalid Index");
                System.out.println(e);
            }
        }
        if(i>=5){
            System.out.println("Error");
        }
    }
}
