public class nrr_looping_statements5
{
    public static void main(String[] args)
    {
        int n=6;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }
        }
        int m=10;
        int factorial=1;
        for(int i=2; i<=m; i++)
        {
           factorial *=i;
        }
        System.out.println(" factorial of "+m+" is "+factorial);
    }
}
