package Nischal.company;
interface sampleInterface{
    void m1();
    void m2();
}
interface childSampleInterface extends sampleInterface{
    void m3();
    void m4();
}

class Sample implements childSampleInterface{

    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    public void m2() {
        System.out.println("m2");
    }

    @Override
    public void m3() {
        System.out.println("m3");
    }

    @Override
    public void m4() {
        System.out.println("m4");
    }
}
public class inheritanceInterfaces {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.m1();
        s.m2();
        s.m3();
        s.m4();
    }
}
