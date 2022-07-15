import java.io.IOException;
import java.util.Scanner;

public class nrr_handlinf_specific_exceptions {
    public static void main(String[] args) {
        int [] marks = new int[4];
        marks[0]=8;
        marks[1]=11;
        marks[2]=15;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int number = sc.nextInt();

        try{
            System.out.println("The value of array index is "+marks[ind]);
            System.out.println("The value of quotient is "+marks[ind]/number);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The input is out of bounds");
            System.out.println(e);
        }
       catch (Exception e){
           System.out.println("Error!!!! ");
           System.out.println(e);
       }

    }
}
