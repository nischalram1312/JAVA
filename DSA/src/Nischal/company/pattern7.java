package Nischal.company;

import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int spaces = 0;
        for(int i=1; i<=n; i++){
            for(int j = 1; j<=spaces; j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            spaces++;
            System.out.println();
        }
    }
}
