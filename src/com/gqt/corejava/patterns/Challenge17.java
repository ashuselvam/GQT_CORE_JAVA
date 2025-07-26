package com.gqt.corejava.patterns;
import java.util.Scanner;

public class Challenge17
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			char ch=(char)('A'+(2*i-2));
			for(int k=1;k<=(2*i-1);k++)
			{
				System.out.print(ch+" ");
				ch--;
			}
			
			System.out.println();
		}

	}

}