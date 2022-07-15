public class nrr_looping_statements8
{
    public static void main(String[] args)
    {
        int n=8;
        int sum=0;
        for(int i=10;i>0;i--)
        {
            int product = n*i;
            System.out.println(product);
            sum+=product;

        }
        System.out.println(sum);
    }
}
