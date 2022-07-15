package Nischal.company;
public class nrr_method_overloading
{
    public static void main(String[] args)
    {
        String x = "HEY JOKER";
        tellJoke(x," Whats up");
        tellJoke(x);

    }
    static void tellJoke(String a)
    {
        System.out.println(a);
    }
    static void tellJoke(String a, String b)
    {
        System.out.println(a+b);
    }
}
