public class MegaBytesConverter extends Main
{
    public static void printMegaBytesAndKiloBytes (int kilobytes)
    {
        if(kilobytes>0)
        {
            int megaBytes = kilobytes / 1024;
            int kiloBytes = kilobytes % 1024;
            System.out.println(kilobytes + "KB" + " = " + megaBytes + "MB" + " and " + kiloBytes + "KB");
        }
        else
        {
            System.out.println("Invalid Value");
        }
    }
}
