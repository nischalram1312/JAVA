package Nischal.company;
interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("hello");
    }
    default void record4K(){
        greet();
        System.out.println("Recording in 4K");
    }
}


interface Wifi{
    String  [] getNetworks();
    void connectToNetwork(String network);
}


class CellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting......");
    }


}


class SmartPhone extends CellPhone implements Camera, Wifi {

    @Override
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting network strings");
        String [] newtworkList={"Ram","Nischal","Raghuram"};
        return newtworkList;

    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting ti " + network);
    }
}

public class polymorphismInInterfaces {
    public static void main(String[] args) {
        Camera c = new SmartPhone();
        c.record4K();
        c.recordVideo();
        c.takeSnap();
        Wifi w = new SmartPhone();
        w.connectToNetwork("abe");
        w.getNetworks();
    }
}
