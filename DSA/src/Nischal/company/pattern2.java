package Nischal.company;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=n; i>0; i--){
//            for (int j = 1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=n; i>0; i--){
            for(int j =1; j<=i ; j++){
                System.out.print("*\t");
            }
            for(int j = 1; j<n;j++){
                System.out.print("\t*\t");
            }
            System.out.println();
        }
    }
    }

