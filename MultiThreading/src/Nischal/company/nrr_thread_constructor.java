package Nischal.company;
class MyThe extends Thread{
    public MyThe(String name){
        super(name);
    }
    public void run(){
        while(true){
//            System.out.println("I am a thread");
        }
    }
}
public class nrr_thread_constructor {
    public static void main(String[] args) {
        MyThe t = new MyThe("Ram");
        System.out.println("The id of the thread is "+t.getId());
        System.out.println("The name of the thread is "+t.getName());
        t.start();
    }
}
