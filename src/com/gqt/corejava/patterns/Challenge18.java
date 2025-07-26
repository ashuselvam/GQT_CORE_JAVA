package com.gqt.corejava.patterns;
import java.util.Scanner;

public class Challenge18{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(char k='A';k<('A'+i);k++)
			{
				System.out.print(k);
			}
			for(char s='A';s<('A'+i-1);s++)
			{
				System.out.print(s);
			}
			System.out.println();
		}

	}

}