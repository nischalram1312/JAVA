package Nischal.company;
class Monkey{
    void jump(){
        System.out.println("Jumping.....");
    }
    void bite(){
        System.out.println("Biting......");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Speaking.....");
    }

    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }
}
public class Practice2 {
    public static void main(String[] args) {
        Monkey ram = new Human();
        ram.jump();
        ram.bite();

    }
}
