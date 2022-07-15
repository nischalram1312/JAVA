package Nischal.company;
public class fibonacci1
{
    public static void main(String[] args)
    {
        System.out.println( fibonacci(4));
    }
    public static int fibonacci(int n)
    {
        if (n <= 1)
        {
            return n;
        }
        else
        {
            
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
