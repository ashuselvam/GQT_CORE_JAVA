package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Challenge8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Upper
        for (int i = 1; i <= rows; i++) {
         for (int space = 1; space <= rows - i; space++) {
                System.out.print("  ");
            }

           
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        // Lower half
        for (int i = rows - 1; i >= 1; i--) {
            
            for (int space = 1; space <= rows - i; space++) {
                System.out.print("  ");
            }

            
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
