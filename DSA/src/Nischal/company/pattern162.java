package Nischal.company;

import java.util.Scanner;

public class pattern162 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = 2 * n - 3;
        int st = 1;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= st; j++)
            {
                System.out.print("*	");
            }

            for (int j = 1; j <= sp; j++)
            {
                System.out.print("	");
            }
            for (int j = 1; j <= st; j++)
            {
                System.out.print("*	");
            }
            st++;
            sp -= 2;
            System.out.println();
        }
    }
}