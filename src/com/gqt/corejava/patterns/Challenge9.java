package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Challenge9{
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the size:");
	int n=sc.nextInt();
	for (int i=1;i<=n; i++) {
        for (int j = i; j < n; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= (2 * i - 1); j++) {
            if (j == 1 || j == (2 * i - 1)) {
                System.out.print(i);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    // Print the lower half of the diamond
    for (int i = n - 1; i >= 1; i--) {
        for (int j =n; j > i; j--) {
            System.out.print(" ");
        }
        for (int j = 1; j <= (2 * i - 1); j++) {
            if (j == 1 || j == (2 * i - 1)) {
                System.out.print(i);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
	

}
}