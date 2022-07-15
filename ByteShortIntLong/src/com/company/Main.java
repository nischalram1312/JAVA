//->Byte Short Int Long
package com.company;

public class Main {

//range of primitive data types
//primitive data types 1.boolean 2.byte-8bits 3.char 4.short-16bits 5.int-32bits 6.long-64bits 7.float 8.double
    public static void main(String[] args)
    {
       
//min max values of int
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum value =" + myMinIntValue);
        System.out.println("Integer Maximum value =" + myMaxIntValue);
        //overflow or unederflow, the +1 &-1 did not fit in the existing variable
        System.out.println("Busted Max Value =" +(myMaxIntValue+1));
        System.out.println("Busted Min Value =" +(myMinIntValue-1));

//min max values of byte
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value =" + myMinByteValue);
        System.out.println("Byte Maximum value =" + myMaxByteValue);

//min max values of short
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value =" + myMinShortValue);
        System.out.println("Short Maximum value =" + myMaxShortValue);

//min max values of long
        long myLongValue=100L;//long literal ends with L, if L is absent java will treat it as an integer
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum value =" + myMinLongValue);
        System.out.println("Long Maximum value =" + myMaxLongValue);

//arithmetic operations of primitive data types
        int myNewIntValue = (myMinIntValue/2);

        /* byte myNewByteValue = (myMinIntValue/2);
       it will not work for byte because the number 2 in parantheses is treated as int as int is default datatype
        */
//Casting- to treat or convert a number from one data type tp another
        byte myNewByteValue = (byte) (myMinIntValue/2);

        short myNewShortValue = (short) (myMinIntValue/2);

//Primitive data types challenge
        byte number1=99;
        short number2=98;
        int number3=97;
        long number4=50000L+(10L*(number1+number2+number3));
        System.out.println("the final answer is "+number4);
        short number5=(short) (1000+(10*(number1+number2+number3)));
        //casting to be used for short and integers but it is not needed for long and int
    }
}
