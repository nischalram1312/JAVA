package Nischal.company;

public class fiibonacci_Series_recursion {
    public static void main(String[] args) {
        int x=6;
        System.out.print(f(x));
        System.out.println("");
        for(int i=0;i<=x;i++){
            System.out.print(f(i)+" ");
        }
    }
    public static int f(int n){
        if(n==0||n==1) {
            return 1;
        }
        else{
            return f(n-1)+f(n-2);
        }

    }
}

