package Nischal.company;
public class Main
{
    static int a=0,b=1,c=0;

    public static void main(String[] args)
    {
        System.out.println(a+" "+b);
        f(10);

    }
    public static void f(int n)
    {
        if(n>=1)
        {
            c=a+b;
            System.out.println(" "+c);
            a=b;
            b=c;
            f(n-1);
        }
    }
}
