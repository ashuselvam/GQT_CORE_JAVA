package com.gqt.corejava.patterns;
import java.util.Scanner;
/**
 * @author Aswica
 * @category patterns
 * @description This is an example for Alphabet
  */
public class Alpha22{

	/**
	 * @param args
	 * @description This contains source code for the Alphabet pattern
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) 
			{
				if(i-j==n/2||i+j==(n-1)+(n/2))
				{
					System.out.print("# ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
