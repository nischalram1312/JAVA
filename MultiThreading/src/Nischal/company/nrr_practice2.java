package Nischal.company;
class threading1 extends Thread{
    public void run(){
        while (true){
            try {
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("welcome");
        }

    }
}
class threading2 extends Thread{
    public void run(){
        while (true){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("welcome back");
        }

    }
}
public class nrr_practice2 {
    public static void main(String[] args) {
        threading1 t1 = new threading1();
        threading2 t2 = new threading2();
        t1.setPriority(6);
        t2.setPriority(9);//sets priority of thread
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());//returns the priority od thread
        t1.start();
        System.out.println(t1.getState());
        System.out.println(t2.getState());//returns the state of the thread
        t2.start();
        System.out.println(Thread.currentThread().getState());
    }
}
