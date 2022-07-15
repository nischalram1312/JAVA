package Nischal.company;
class cellPhone{
    public void ringing(){
        System.out.println("Ringing");
    }
    public void vibrating(){
        System.out.println("Vibrating");
    }
    public void calling(){
        System.out.println("calling");
    }
}

public class nrr_oops_practice1 {
    public static void main(String[] args) {
        cellPhone RedmiNote10 = new cellPhone();
        RedmiNote10.calling();
        RedmiNote10.vibrating();
        RedmiNote10.ringing();
    }
}
