package Nischal.company;
@FunctionalInterface
interface Horn{
    void meth1(int a);
}
//class anonyDemo implements Horn{
//    public void display(){
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("I am meth 1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("I am meth 2");
//    }
//}
//class Nischal implements Horn{
//    @Override
//    public void meth1() {
//        System.out.println("M 1");
//    }
//}
public class Main {

    public static void main(String[] args) {
//        anonyDemo obj = new anonyDemo();
//        obj.meth1();
//        obj.meth2();
        //Anononymous cass
//        Horn obj = new Horn() {
//            @Override
//            public void meth1() {
//                System.out.println("Meth 1");
//            }
//        };
//        obj.meth1();

        //Lamda Expressions
//        Horn o = new Nischal();
//        o.meth1();
        Horn o = (a)->{ System.out.println("I am method 1 ----->"+a); };
        o.meth1(6);
    }
}
