package Nischal.company;
public class Main
{
    public static void main(String[] args)
    {
        int n = 10;
        for (int i=0; i<=n; i++)
        {
            System.out.print(" "+fibbo(i));
        }
    }
    public static int fibbo(int n)
    {
        if(n <= 1 )
        {
            return 1;
        }
        else
        {
            return fibbo(n-1)+fibbo(n-2);
        }

    }
}
