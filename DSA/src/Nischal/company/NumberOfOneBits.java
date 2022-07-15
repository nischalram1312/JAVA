package Nischal.company;

import java.util.Scanner;

class numberOfBits{
    public int noOfBits (int n){
        int count=0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}

public class NumberOfOneBits {

    public static void main(String[] args) {
        numberOfBits n = new numberOfBits();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        int a = n.noOfBits(x);
        System.out.println(a);
    }
}
