package test3;

import java.util.Scanner;

public class test35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How mach money do you need to reture?");
        double goal = in.nextDouble();

        System.out.println("How mach money will you contrbiute ervey year?");
        double payment = in.nextDouble();

        System.out.println("Insert  rate in %:");
        double insertrate = in.nextDouble();

        double balance = 0;
        int years = 0;

        while (balance < goal) {
            balance += payment;
            double interest = balance * insertrate / 100;
            balance += interest;
            years++;
        }
        System.out.println("you can retire in " + years + "  years");
    }
}
