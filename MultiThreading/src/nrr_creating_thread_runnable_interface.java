class myThreadRunnable1 implements Runnable{
    public void run(){
        System.out.println("I am a bullet 1");
        System.out.println("I am a bullet 1");
        System.out.println("I am a bullet 1");
    }
}
class myThreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("I am a bullet 2");
        System.out.println("I am a bullet 2");
        System.out.println("I am a bullet 2");
        System.out.println("I am a bullet 2");
    }
}
public class nrr_creating_thread_runnable_interface {
    public static void main(String[] args) {
        myThreadRunnable1 bullet1 = new myThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        myThreadRunnable2 bullet2 = new myThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
