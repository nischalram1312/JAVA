package Nischal.company;

public class nrr_pattern2 {
    public static void main(String[] args) {
        pattern1(5);
    }
    public static void pattern1(int n){
        for(int i=n; i>=0 ; i--){//determines the number of lines
            for(int j=0; j<i ; j++){//determines the number of stars
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
