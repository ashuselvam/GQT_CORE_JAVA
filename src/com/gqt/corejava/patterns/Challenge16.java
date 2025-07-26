package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Challenge16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int space = 1; space <= n - i - 1; space++) {
                System.out.print(" ");
            }

            char ch = (char) ('A' + i);
            for (char j = ch; j >= 'A'; j--) {
                System.out.print(j);
            }
            for (char j = 'B'; j <= ch; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
