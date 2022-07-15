import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b){
        int returnvalue=0;
        int power=1;
        while(n>0){
            int digit = n%b;
            returnvalue= returnvalue+(digit*power);
            n=n/b;
            power = power*10;
        }
        return returnvalue;
    }
}
