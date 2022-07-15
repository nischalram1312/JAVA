class myThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<10) {
            System.out.println("Thread 1 Cooking");
            System.out.println("I am happy");
            i++;
        }

    }
}
class myThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<10) {
            System.out.println("Thread 2 chatting");
            System.out.println("I am sad");
            i++;
        }
    }
}

public class nrr_creating_thread {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();
    }
}
