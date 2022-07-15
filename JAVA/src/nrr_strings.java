import java.util.Scanner;
public class nrr_strings
{
    public static void main(String[] args)
    {
        String name =new String("RAM");
        //or
        String name1 = "Ram";
        System.out.print("Name is : ");
        System.out.print(name);
        int a =6;
        float b=5.22343f;
        System.out.println("");
        System.out.printf("The value of a is %d and the value of b is %.3f", a, b);
        System.out.println("");
        System.out.format("The value of a is %d and the value of b is %8.2f\n", a, b);
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.format(st);
    }
}
