package Nischal.company;
public class fibonacciSeries
{
    public static int Fibonacci(int x)
    {
        int a=0,b=1,c=0;
        if(x==1 || x==0)
        {
            return 1;
        }
        else
        {
            return Fibonacci(x-1);
        }
    }
}
