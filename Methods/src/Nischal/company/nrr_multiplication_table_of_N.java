package Nischal.company;

public class nrr_multiplication_table_of_N {
    public static void main(String[] args) {
        multiplicationTable(7);
    }
    public static void multiplicationTable(int n)
    {
        int product=1;
        for(int i=1; i<=10; i++){
            product=n*i;
            System.out.println(n+" * "+i+" = "+product);
        }
    }
}
