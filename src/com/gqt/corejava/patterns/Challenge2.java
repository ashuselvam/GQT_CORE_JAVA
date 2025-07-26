package com.gqt.corejava.patterns;
import java.util.Scanner;

	
	public class Challenge2{
		public static void main(String[] args) {
					Scanner sc=new Scanner(System.in);
					System.out.println("enter count");
					int n=sc.nextInt();
				    int c=1;
					for(int i=1;i<=n;i++) {
						for(int j=1;j<=i;j++) {
							System.out.print(j+" ");
					c++;
						}
						System.out.println();
					}
				}

				}


