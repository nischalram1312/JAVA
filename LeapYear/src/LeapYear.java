public class LeapYear extends Main
{
    public static boolean isLeapYear(int year)
    {
        if(year <= 0 || year > 9999)
        {
            return false;
        }
        else if(year%4==0&&year%100==0&&year%400==0)
        {
                return true;
        }
        else
        {
            return false;
        }
    }
}


