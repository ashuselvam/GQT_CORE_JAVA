package com.gqt.corejava.patterns;
import java.util.Scanner;

public class Challenge7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            // for spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print("  "); 
            }

            // for incr num
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // for decr num
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
