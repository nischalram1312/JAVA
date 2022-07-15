import java.util.Scanner;

public class npr {
    public static int factorial(int n){
        int factorial =1;
        for(int i=1; i<=n; i++){
            factorial*=i;
        }
        return factorial;
    }
    public static void display(int n, int r, int npr){
        System.out.println(n+"P"+r+" = "+npr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nfactorial=factorial(n);
        int nmrfactorial=factorial(r);
        int npr = nfactorial/nmrfactorial;
        display(n,r,npr);
    }
}
