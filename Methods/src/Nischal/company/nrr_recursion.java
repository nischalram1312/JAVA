package Nischal.company;
public class nrr_recursion
{
    public static void main(String[] args)
    {
        System.out.println(factorial(4));
        System.out.println(sum(4));
    }
    static int factorial(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return n * factorial(n-1);
        }
    }
    static int sum(int n)
    {
        if(n!=0)
        {
            return n+sum(n-1);
        }
        else
        {
            return n ;
        }
    }

}
