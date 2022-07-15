package Nischal.company;

abstract class BaseClass{
    public BaseClass(){
        System.out.println("Constructor of Base Class");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet1();

    abstract public void greet2();
}

class SubClass extends BaseClass{
    @Override
    public void greet1(){
        System.out.println("Good Morning");
    }
    public void greet2(){
        System.out.println("How are you?");
    }

}

abstract class SubClass2 extends BaseClass{
    public void th(){
        System.out.println("Hi");
    }
}

public class Main {

    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.greet1();
        s.greet2();
    }
}
