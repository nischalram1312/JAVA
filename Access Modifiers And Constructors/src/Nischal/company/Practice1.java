package Nischal.company;

import java.util.Scanner;

class cylinder{
    private int radius;
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    private int height;
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
public class Practice1 {
    public static void main(String[] args) {
        cylinder c = new cylinder();
        c.setHeight(12);
        c.setRadius(9);
        int h = c.getHeight();
        int r = c.getRadius();
        System.out.println(c.surfaceArea());
        System.out.println(c.volume());
    }
}
