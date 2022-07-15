import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.awt.*;
import java.util.Scanner;

abstract class Shape {
        abstract public void Area(double x, double y);
    }


class square extends Shape {
    @Override
    public void Area(double a, double b) {
        b=1;
        double area = a*a;
        System.out.println(area);
    }
}

class circle extends Shape{
    @Override
    public void Area(double a, double b) {
        b=1;
        double area = Math.PI*a*a;
        System.out.println(area);
    }
}

class rectangle extends Shape{

    @Override
    public void Area(double a, double b) {

        double area = a*b;
        System.out.println(area);
    }
}
class AreaOfShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Make a selection");
        System.out.println("1 = Square ");
        System.out.println("2 = Circle");
        System.out.println("3 = Rectangle");
        int i = sc.nextInt();
        square s = new square();
        circle c = new circle();
        rectangle r = new rectangle();
       switch (i){
           case 1:
               System.out.println("enter side");
               double side = sc.nextDouble();
               s.Area(side,1);
               break;
           case 2:
               System.out.println("enter radius");
               double radius = sc.nextDouble();
               c.Area(radius,1);
               break;
           case 3:
               System.out.println("enter length and width");
           double length = sc.nextDouble();
           double width = sc.nextDouble();
               r.Area(length, width);
               break;
           default:
               System.out.println("invalid input");
               break;
       }
    }
}






