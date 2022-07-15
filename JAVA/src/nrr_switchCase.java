import java.util.Scanner;
public class nrr_switchCase
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch(age)
        {
            case 18:
                System.out.println("You are almost an adult");
                break;
            case 24:
                System.out.println("You are an adult");
                break;
            case 55:
                System.out.println("you are old");
                break;
            default:
                System.out.println("xyz");
                break;
        }
    }
}
