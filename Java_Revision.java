package com.seleniumtesting;

import java.util.Scanner;

public class Java_Revision {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number");
//			int n =sc.nextInt();
//			int factorial = 1;
//		for(int i=1;i<=n;i++) {
//			factorial = factorial*i;
//		}
//		System.out.println(factorial);
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
			int n = sc.nextInt();
			int a,i=0,j=0;
			a=n;
			while (a>0) {
				i=a%10;
				j=(j*10)+i;
				a=a/10;
			}
			System.out.println("The reverse number is"+j);
		
		
		
		
		
		
		
	}

}
