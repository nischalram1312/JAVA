//->String
//string is a sequence of characters
package com.company;

public class Main
{

    public static void main(String[] args)
    {
        String myString = "This is my String";
        System.out.println("myString is equal to "+myString);
        myString="mystring is equal to "+myString+" and there is more ";
        System.out.println(myString);
        myString=myString+"\n\u00A92020";
        System.out.println(myString);
        String Numberstring="120"+"40";
        System.out.println(Numberstring);
        String lastString= "10";
        int myInt=50;
        lastString=lastString+myInt;
        System.out.println("last string is equal to "+lastString);
        /*
        strings in java are immutable which means that we cannot change a string once it is created
        String lastString= "10";
        int myInt=50;
        lastString=lastString+myInt;
        here a new String is created to store lastString=lastString+myInt.
        */
    }
}
