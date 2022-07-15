package Nischal.company;
class MyTh extends Thread{
    public void run(){
        int i =20;
        while(true){
        System.out.println("Thank you");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
////            System.out.println("I am a thread");
        }
    }
}
class MyTh2 extends Thread{
    public void run(){
        int i =20;
        while(true){
            System.out.println("My Thank you");
////            System.out.println("I am a thread");
        }
    }
}

public class nrr_thread_methods {
    public static void main(String[] args) {
        MyTh t1 = new MyTh();
        MyTh2 t2 = new MyTh2();
        t1.start();
//        try {
//            t1.join();//t2 will start only after t1 is completed
//        }
//        catch(Exception e){
//            System.out.println("e");
//        }
        t2.start();
    }
}
