package Nischal.company;
class Square{
    int side=3;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

public class practice2 {
    public static void main(String[] args) {
        Square s = new Square();
        System.out.println(s.area());
        System.out.println(s.perimeter());
    }
}
