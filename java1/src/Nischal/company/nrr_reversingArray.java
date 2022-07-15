package Nischal.company;
public class nrr_reversingArray
{
    public static void main(String[] args)
    {
        int [] arr = {1,2,3,4,5,6};
        // swap a[i] with a[l-1-i]
        int l = arr.length;
        int temp=0;
        int n= Math.floorDiv(l,2);
        for(int i=0;i<n;i++)
        {
            //swap a[i] and a[l-1-i]
            temp=arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;
        }
        for (int element:arr)
        {
            System.out.print(element+" ");
        }

    }

}
