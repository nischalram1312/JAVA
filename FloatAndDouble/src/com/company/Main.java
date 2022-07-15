//->Float And Double
//Single precision float occupies 32 bits while Double Precision Double occupies 64 bits
package com.company;
public class Main
{
    public static void main(String[] args)
    {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum value = "+myMinFloatValue);
        System.out.println("Float Maximum value = "+myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum value = "+myMinDoubleValue);
        System.out.println("Double Maximum value = "+myMaxDoubleValue);

        /*int myIntValue=5;
        float myFloatValue=(float) 5.25; //casting or float myFloatValue= 5.25f;
        double myDoublevalue=5d;*/
        /*java treats double as the default for decimal or floating
        point number so we need to specify d and f after variable*/
        int myIntValue=5/3;
        float myFloatValue= 5.2f/3f;
        double myDoublevalue=5.2d/3d;
        System.out.println("my int = "+myIntValue);
        System.out.println("my float ="+myFloatValue);

// challenge
        double pounds = 180d;
        double kilograms = 0.45359237d*pounds;
        System.out.println("The number of kilograms ="+kilograms);

    }
}
