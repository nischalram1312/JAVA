public class nrr_looping_statements7
{
    public static void main(String[] args)
    {
      /*  int n=4;
        int i=1;
        int j =1;
        while(i<=n)
        {
            while(j<=i)
            {
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            i++;
        }*/
        int rows = 5, i = 1, j = 1;

        while(i <= rows)
        {
            while(j <= i)
            {
                System.out.print("*");
                j++;

            }
            System.out.print("\n");
            i++;

        }
    }
}
