package test3;

import java.util.Arrays;

public class test38 {
    public static void main(String[] args) {
        final double STRATE = 10;
        final int NYEAR = 10;
        final int NRATE = 6;

        double  []interestRate = new double[NRATE];
        
        for (int j = 0; j < interestRate.length; j++) {
            interestRate[j] = (STRATE + j) / 100;
        }
        double[][] balance = new double[NYEAR][NRATE];
        Arrays.fill(balance[0], 10000);
        for (int j = 1; j < balance.length; j++) {
            for (int i = 0; i < balance[i].length; i++) {
                double increase = balance[j - 1][i] * interestRate[i];
                balance[j][i] = balance[j - 1][i] + increase;
            }
        }
        for (double a : interestRate) {
            a = a * 100;
            System.out.printf("%9.0f%%", a);
        }
        System.out.println();
        for(double row[] :balance) {
            for (double b : row) {
                System.out.printf("%10.2f", b);

            }
            System.out.println();
        }

        }
    }