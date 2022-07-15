package Nischal.company;

public class nrr_pattern1_recursion {
    public static void main(String[] args) {
        printRec(4);
    }
    public static void printRec(int n){
        if(n==0) {
            System.out.println("");
        }
        else {
            printRec(n-1);
            for (int i=n; i>0 ;i--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
