package Nischal.company;
import java.util.Scanner;
public class RotatingaDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int k = sc.nextInt();
        int count=0;
        int temp = number;
        while(temp != 0){
            temp = temp/10;
            count++;
        }
        if(k>count){
            k=k%count;
        }
        else if (k<0){
            k=k%count;
            k=k+count;
        }
        else{
            k=k;
        }

        int quotient = number/(int)(Math.pow(10,k));
        int remainder = number%(int)(Math.pow(10,k));
        int r = quotient+ (int)(remainder*(Math.pow(10,count-k)));
        System.out.println(r);
    }
}
