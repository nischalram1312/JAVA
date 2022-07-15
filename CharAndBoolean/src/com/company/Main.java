//->Char And Boolean
package com.company;

public class Main
{
    public static void main(String[] args)

    /*char has a size if 2 bytes or 16 bits because it can store 65535 unicode charecters
    for example 0044 is a code for D
     */
    {
        char myChar = 'D';
        char myUnicode = '\u0044';
        System.out.println(myUnicode);
        System.out.println(myChar);


        /*boolean allows 2 values true or false 1 or 0 yes or no*/
        boolean myTrueBooleanValue=true;
        boolean myFalseBooleanValue=false;

        boolean CustomerOver21 = true;
    }
}
