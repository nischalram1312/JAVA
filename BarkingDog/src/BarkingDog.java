public class BarkingDog extends Main
{
    public static boolean shouldWakeUp(boolean barking, int hourOfDay)
    {
        if(barking == true)
        {
            if (hourOfDay <= 8 && hourOfDay >= 0 || hourOfDay < 24 && hourOfDay >= 22) {
                return true;
            } else {
                return false;
            }
        }
            else
            {
                return false;
            }
    }
}
