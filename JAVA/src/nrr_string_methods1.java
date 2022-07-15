public class nrr_string_methods1
{
    public static void main(String[] args)
    {
        String name = "nischal raghuram puvvala";
        System.out.println(name.length());
        System.out.println("original string is "+name);
        name =name.toUpperCase();
        System.out.println("converted to uppercase"+name);
        String LowerString=name.toLowerCase();
        System.out.println("converted to lowercase " +LowerString);

        String nonTrimmedString = "     RAM      ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());
    }
}
