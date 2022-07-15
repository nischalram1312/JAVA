package Nischal.company;

public class nrr_throw_vs_throws {
    public static int divide (int a, int b)throws ArithmeticException{
        //made by ram
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        // shivam uses divide fubction created by ram
        try {
            int c = divide(6, 0);
            try {
                int d = divide(6, 1);
                System.out.println(d);
            }
            catch (Exception e){
                System.out.println("Exception- "+e);
            }

                System.out.println(c);
        }
        catch (Exception e){
            System.out.println("Exception- "+e);
        }
    }
}
