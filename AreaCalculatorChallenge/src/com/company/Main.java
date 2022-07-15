package com.company;
public class Main
{
    public static double INVALID_ENTRY=-1.0;
    public static void main(String[] args)
    {
        System.out.println(area(25.23,30.98));
        System.out.println(area(30.89));
    }
    public static double area(double radius)
    {
        if(radius<0)
        {
            return INVALID_ENTRY;
        }
        else
        {
            double area = 3.14*radius*radius;
            return area;
        }
    }
    public static double area(double length,double width)
    {
        if(length<0||width<0)
        {
            return INVALID_ENTRY;
        }
        else
        {
            double area = length*width;
            return area;
        }
    }
}
