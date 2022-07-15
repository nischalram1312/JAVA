package Nischal.company;

public class methTag {
    /**
     *
     * @param args These are arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("MAIN");
    }

    /**
     *
     * @param i  This is the first argument
     * @param j  This is the second argument
     * @return   sum of arguments
     * @throws Exception if i is 0
     * @deprecated This method is deprecated please use + operator
     */
    public int add(int i, int j)throws Exception{
        if(i==0){
            throw new Exception();
        }
        int c=i+j;
        return c;
    }
}

