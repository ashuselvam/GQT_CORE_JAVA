/**
 *  #  
    #  #  
    #  -  #  
    #  -  -  #  
    #  #  #  #  #  

 */
package com.gqt.corejava.patterns;

import java.util.Scanner;

/**
 * @author Aswica
 * @category patterns
 * @description This is example for conditional statements
 */
public class NewPattern2 {

	/**
	 * @param args
	 * @description This contains conditional statements
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
        	for(int j=0;j<=i;j++) {
        		if(i==0||i==n-1||j==0||j==i) {
        			System.out.print("#  ");
        		}
        		else {
        			System.out.print("-  ");
        		}
        	}
        	System.out.println();        
        	}
	}

}