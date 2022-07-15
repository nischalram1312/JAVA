package Nischal.company;
public class Main
{
    public static void main(String[] args)
    {
        int a=9;
        int b=6;
        Main obj=new Main();
        int c = obj.logic(9,4);
        System.out.println(c);
        System.out.println(obj.logic(9,7));
        obj.logic(a,b);
    }
    int logic(int x, int y)
    {
        int sum=0;
        sum= x+y;
        return sum;
    }
}
