package Nischal.company;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
    }
    public static boolean canPack(int big, int small, int goal)
    {
        int bigTotal=big*5;
        int total=bigTotal+small;
        if(big<0||small<0||goal<0)
        {
            return false;
        }
        else if(total==goal)
        {
            return true;
        }
        else if(bigTotal<=goal&&total>=goal)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
