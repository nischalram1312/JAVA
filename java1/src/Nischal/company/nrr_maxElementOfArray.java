package Nischal.company;

public class nrr_maxElementOfArray
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6,99};
        int max=0;
        for (int element:arr)
        {
            if(element>max)
            {
                max=element;
            }
        }
        System.out.println(max);
    }
}
