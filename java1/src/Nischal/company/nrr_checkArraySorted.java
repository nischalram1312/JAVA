package Nischal.company;
public class nrr_checkArraySorted
{
    public static void main(String[] args)
    {
       boolean isSorted=true;
       int[] arr = {1,2,3,4,5,6};
       for(int i=0;i<arr.length-1;i++)
       {
           if(arr[i]>arr[i+1])
           {
               isSorted=false;
               break;
           }

       }
       if(isSorted)
       {
           System.out.println("array is sorted");
       }
       else
       {
           System.out.println("array is not sorted");
       }
    }
}
