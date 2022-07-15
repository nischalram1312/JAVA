import java.util.Scanner;
public class nrr_string_methods2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name="raghuram";
        System.out.println(name.substring(1));
        System.out.println(name.substring(1,6));

        System.out.println(name.replace('r','a'));
        System.out.println(name.replace("ram","xyz"));
        System.out.println(name.replace("r","xyz"));

        System.out.println(name.startsWith("a"));
        System.out.println(name.startsWith("rag"));

        System.out.println(name.endsWith("am"));
        System.out.println(name.endsWith("mm"));

        System.out.println(name.charAt(2));
        System.out.println(name.charAt(0));

        System.out.println(name.indexOf("ra"));
        System.out.println(name.indexOf("ra",1));

        System.out.println(name.lastIndexOf("r"));
        System.out.println(name.lastIndexOf("r",0));

        System.out.println(name.equals("raghuram"));
        System.out.println(name.equals("raghuram1"));

        System.out.println(name.equalsIgnoreCase("Raghuram"));
        System.out.println(name.equalsIgnoreCase("raghuram"));

        System.out.println("i am escape sequence \\ \" \tdouble \n quote");
    }
}
