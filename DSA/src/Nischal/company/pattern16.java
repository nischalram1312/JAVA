package Nischal.company;

import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces = 2*n-3;
        int stars = 1;
        for(int i=1; i<=n; i++) {
            int val =1;

            for (int j = 1; j <= stars; j++) {
                System.out.print(val+"\t");
                val++;
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }
            if(i==n){
                stars--;
                val--;
            }
            for (int j = 1; j <= stars; j++) {
                val--;
                System.out.print(val+"\t");
            }
            spaces = spaces - 2;
            stars++;
            System.out.println();
        }
    }
}
