package Nischal.company;

import java.util.Scanner;

public class pythogarenTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int big =a;
        if(b>=big){
            big=b;
        }
        if(c>=big){
            big=c;
        }
        if(big==a){
            boolean f = (a*a==b*b+c*c);
            System.out.println(f);
        }
        else if(big==b){
            boolean f = (b*b==a*a+c*c);
            System.out.println(f);
        }
        else{
            boolean f = (c*c==a*a+b*b);
            System.out.println(f);
        }
    }
}
