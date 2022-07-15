package Nischal.company;
public class nrr_minValueOfArray
{
    public static void main(String[] args)
    {
        int min=99999;
        int[] arr = {1, 2, 3, 4, 5, 6, 99};
        for(int element:arr)
        {
            if(element<min)
            {
                min=element;
            }
        }
        System.out.println(min);
    }
}
