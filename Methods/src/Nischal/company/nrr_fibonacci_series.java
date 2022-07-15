package Nischal.company;
public class nrr_fibonacci_series
{
    public static void main(String[] args)
    {
        fibonacciSeries(4);
    }
    public static void fibonacciSeries(int n)
    {
        int a=0;
        int b=1;
        int c=0;
        n++;
        if(n>=1)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
            fibonacciSeries(n-1);
        }
    }
}
