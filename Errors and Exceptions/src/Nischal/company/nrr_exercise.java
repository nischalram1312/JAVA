package Nischal.company;

public class nrr_exercise {
    public static void forloop(){
    int a = 9;
    int b = 9;
    while (true){
        try{
            System.out.println(a/b);
        }
        catch (Exception e){
            System.out.println(e);
            break;
        }
        finally {
            System.out.println("The value of b is "+b);
        }
        b--;
    }
}
    public static void main(String[] args) {
        forloop();
    }
}
