package Nischal.company;

interface horn{
    void horn();
    void indicator();
}

interface bicycle{
    int b = 45;
    void Break(int decrement);
    void Accelerate( int increment);
}

class avonCycle implements bicycle,horn{
int speed = 7;

    @Override
    public void Break(int decrement) {
        speed=speed-decrement;
        System.out.println("Speed is "+speed);
    }

    @Override
    public void Accelerate(int increment) {
        speed=speed+increment;
        System.out.println("Speed is "+speed);

    }

    @Override
    public void horn() {
        System.out.println("peepeeeepeeee");
    }

    @Override
    public void indicator() {
        System.out.println("tic tic tic tic tic");
    }
}

public class Main {

    public static void main(String[] args) {
        avonCycle a = new avonCycle();

        a.Accelerate(8);
        a.Break(9);
        a.horn();
        a.indicator();
        //we can create properties in interfaces
        //properties given in interface are final
        System.out.println(a.b);
        //a.b=99; will return an error
    }
}
