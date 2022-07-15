package Nischal.company;
public class numberOfWays
{
    public static void main(String[] args)
    {
        System.out.println(numberOfWaysInMatrix(4,4));
    }
    public static int numberOfWaysInMatrix(int n, int m)
    {
        if(n==1||m==1)
        {
            return 1;
        }
        else
        {
            return numberOfWaysInMatrix(n-1,m)+numberOfWaysInMatrix(n,m-1);
        }
    }

}
