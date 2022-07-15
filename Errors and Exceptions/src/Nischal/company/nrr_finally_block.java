package Nischal.company;

public class nrr_finally_block {
    public static int greet(){
        try{
            int a =50;
            int b = 0;
            int c = a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning resources........This is the end of this program");
        }
        return -1;
    }
    public static void main(String[] args) {
       int x = greet();
        System.out.println(x);
    }
}
