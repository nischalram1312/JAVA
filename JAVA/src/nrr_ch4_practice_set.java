import java.util.Scanner;
public class nrr_ch4_practice_set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String r = "rock";
        String p = "paper";
        String s = "scissors";
        System.out.println("first player :");
        String rps = sc.nextLine();
        System.out.println("second player :");
        String rps2 = sc.nextLine();
        if (rps.equals(r) && rps2.equals(p) ) {
            System.out.println("paper"); }
        else if (rps.equals(p) && rps2.equals(r)) {
            System.out.println("paper"); }
        else if (rps.equals(p) && rps2.equals(s)) {
            System.out.println("scissor"); }
        else if (rps.equals(s) && rps2.equals(p)) {
            System.out.println("scissor"); }
        else if (rps.equals(s) && rps2.equals(r)) {
            System.out.println("rock"); }
        else if(rps.equals(r) && rps2.equals(s)) {
            System.out.println("rock"); }
        else{
            System.out.println("invalid entry"); }
    }}
