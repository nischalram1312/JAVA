import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b){
        int returnval=0;
        int power=1;
        while(n>0){
            int digit = n%10;
            n=n/10;
            returnval = returnval+(digit*power);
            power = power*b;
        }
        return returnval;
    }
}
