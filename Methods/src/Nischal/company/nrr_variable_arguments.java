package Nischal.company;
public class nrr_variable_arguments
{
    public static void main(String[] args)
    {
        System.out.println("Welcome To My World");
        System.out.println(foo(1,2,3,4,5,6,7));
        System.out.println(foo());
    }
    public static int foo(int ... arr)
    {
        int sum =0;
        for(int i:arr)
        {
            sum=sum+i;
        }
        return sum;
    }

}
