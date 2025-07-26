package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Challenge13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int space = 1; space <= n - i - 1; space++) {
                System.out.print(" ");
            }
            char ch = (char) ('A' + i);
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
