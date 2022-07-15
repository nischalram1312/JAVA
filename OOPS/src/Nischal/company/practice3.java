package Nischal.company;
class Tommy{
    public void hit(){
        System.out.println("Hitting enemy");
    }
    public void run(){
        System.out.println("Running to kill");
    }
    public void kill(){
        System.out.println("Killed the bugger");
    }
}
public class practice3 {
    public static void main(String[] args) {
        Tommy player1 = new Tommy();
        player1.hit();
        player1.run();
        player1.kill();
    }
}
