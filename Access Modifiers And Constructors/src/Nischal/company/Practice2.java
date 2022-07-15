package Nischal.company;
class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return (2*Math.PI*radius*radius)+(2*Math.PI*radius*height);
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }

}
public class Practice2 {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(9,12);
        System.out.println(c.surfaceArea());
        System.out.println(c.volume());
    }
}
