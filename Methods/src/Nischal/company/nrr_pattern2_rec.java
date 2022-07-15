package Nischal.company;

public class nrr_pattern2_rec {
    public static void main(String[] args) {
        printRec(4);
    }
    public static void printRec(int n){
        if(n==0) {
            System.out.println("");
        }
        else {
            for (int i=n; i>0 ;i--) {
                System.out.print("*");
            }
            System.out.println(" ");
            printRec(n-1);
        }
    }
}
