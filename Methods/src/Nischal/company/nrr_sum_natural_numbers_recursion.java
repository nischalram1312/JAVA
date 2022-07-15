package Nischal.company;

public class nrr_sum_natural_numbers_recursion {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    public static int sum(int n){
        if(n==1) {
            return n;
        }
        else{
            return n+sum(n-1);
        }
    }
}
