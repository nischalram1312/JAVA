public class DecimanCompactor extends Main
{
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2)
    {
        int a = (int) num1 * 1000;
        int b = (int) num2 * 1000;
        if(a==b)
        {
            System.out.println(true);
            return true;
        }
        else
            return false;
    }
}
