import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int  b2= sc.nextInt();
        int decimal = getValueIndecimal(n,b1);
        int answer = getValueInBase(decimal, b2);
        System.out.println(answer);
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
