package org.apex.java_assignment;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		BasicCalculator cal=new BasicCalculator();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1=s.nextInt();
		System.out.println("Enter the second number: ");
		int num2=s.nextInt();
		int r = 0;
		System.out.println("C");
		cal.addition(r);
		cal.division(r);
		
	}

}
