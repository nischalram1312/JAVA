package Nischal.company;
public class Main
{
    public static void main(String[] args)
    {
        String numberAsString = "2018.125";
        System.out.println("numberAsString= "+ numberAsString);
        //using an Integer class and parseInt method
        //cant use anything other than numbers in this method like "2018a" or "2018.124"
        //int number = Integer.parseInt(numberAsString);
        //System.out.println(number);
        double number1 = Double.parseDouble(numberAsString);
        System.out.println(number1);
        numberAsString +=1;
        //number+=1;
        number1+=1;
        System.out.println(numberAsString);
        //System.out.println(number);
        System.out.println(number1);
    }
}
