package com.gqt.corejava.patterns;
import java.util.Scanner;
/**
 * @author Aswica
 * @category patterns
 * @description This is an example for Alphabet
  */
public class Alpha6 {

	/**
	 * @param args
	 * @description This contains source code for the Alphabet pattern
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 ||i==(n/2)||j==0)
				   
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}