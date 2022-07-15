package Nischal.company;

public class nrr_nested_try_catch {
    public static void main(String[] args) {
        int [] marks = new int[4];
        marks[0]=8;
        marks[1]=11;
        marks[2]=15;
        try{
            System.out.println("Welcome to my world");
            try {
                System.out.println(marks[9]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("sorry index dosent exist");
                System.out.println("Exception lev 2");
                System.out.println(e);
            }
        }
        catch (Exception e){
            System.out.println("Exception lev 1");
            System.out.println(e);
        }
    }
}
