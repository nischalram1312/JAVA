package com.company;
public class Main
{
    public static void main(String[] args) {
        int value = 9;
        switch (value) {
            case 1:
                System.out.println("Value was one");
                break;
            case 2:
                System.out.println("Value was two");
                break;
            case 3:
                System.out.println("Value was three");
                break;
            case 6:
            case 4:
            case 5:
                System.out.println("Value was among 4,5 and 6 ");
                break;
            default:
                System.out.println("Value was not 1,2,3,4,5 or 6");
                break;

        }

//Challenge
        char ch = 'A';
        switch (ch)
        {
            case 'A': case 'B':
                System.out.println("Character is A or B");
                break;
            case 'C':
                System.out.println("Character is C");
                break;
            case 'D':
                System.out.println("Character is D");
                break;
            case 'E':
                System.out.println("Character is E");
                break;
            default:
                System.out.println("The character is not among A,B,C,D,E");
                break;
        }
        String month = "january";
        switch (month.toUpperCase())
                //or .toLowerCase() to convert to lower case
        {
            case "JANUARY":
                System.out.println("JAN");
                break;
            case "FEBRUARY":
                System.out.println("FEB");
                break;
            default:
                System.out.println("The month is not JAN or FEB");
                break;
        }
    }
}
