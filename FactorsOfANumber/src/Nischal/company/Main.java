package Nischal.company;

public class Main {

    public static void main(String[] args)
    {
        printFactors(6);
        System.out.println("--------------");
        printFactors(60);
        System.out.println("--------------");

        printFactors(32);
        System.out.println("--------------");

        printFactors(10);


    }
    public static void printFactors(int number)
    {
        if(number>0)
        {
            for(int i=1;i<=number;i++)
            {
                if(number%i==0)
                {
                    System.out.println(i);
                }
            }
        }
    }
}
