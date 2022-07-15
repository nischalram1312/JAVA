package Nischal.company;
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{

    @Override
    void write() {
        System.out.println("Writing");
    }

    @Override
    void refill() {
        System.out.println("Refilling");
    }

    void changeNib(){
        System.out.println("Changing the nib");
    }
}
public class Practice1 {
    public static void main(String[] args) {
        FountainPen newPen = new FountainPen();
        newPen.refill();
        newPen.write();
        newPen.changeNib();
    }
}
