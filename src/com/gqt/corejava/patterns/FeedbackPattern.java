package com.gqt.corejava.patterns;

import java.util.Scanner;

/**
 * @author Aswica
 * @category patterns
 * @description This is an example for Alphabet
  */
public class FeedbackPattern{

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
				if(i==0||j==0||i==n-1||(j==n-1&&i>=n/2)||(i==n/2&&j>=n/2))

				{
					System.out.print("#  ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			
			System.out.print("   ");
			for(int j=0;j<n;j++) 
			{
				if((i==0&&j>0&&j<n-1)||(i==n-2&&j>0&&j<n-1)||
				  (j==0&&i>0&&i<n-2)||(j==n-1&&i>0&&i<n-2)||
				  (i==j&&i>=n/2))
				{
					System.out.print("#  ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) 
			{
				if(i==0||j==n/2)
				{
					System.out.print("#  ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.print("                      ");
			for(int j=0;j<n;j++) {
				if(i==0 ||i==n-1||j==n/2)
				   
				{
					System.out.print("#  ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) 
			{
				if(i==0||j==0&&i<=n/2||i==n/2||j>=n-1&&i>n/2||i>=n-1)
				{
					System.out.print("# ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("                      ");
			for(int j=0;j<n;j++) 
			{
				if(i==0||j==0||i==n-1||(j==n-1&&i>=n/2)||(i==n/2&&j>=n/2))

				{
					System.out.print("#  ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.print("   ");
			
			for(int j=0;j<n;j++) 
			{
				if(j==0||i-j==n/2||i==0&&j<n/2||j==n/2&&i<n/2||i==n/2&&j<=n/2)
				{
					System.out.print("# ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("");
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1)||i==(n/2)||j==0)
				   
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || j==(n-1) ||
				   i==(n/2))
				   
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			for(int j=0;j<n;j++) {
				if(i==0 ||j==(n/2))
				   
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
