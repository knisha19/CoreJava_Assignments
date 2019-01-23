package org.apex.java_assignment;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		BasicCalculator cal=new BasicCalculator();
		int result = 0;
		Scanner s=new Scanner(System.in);
		System.out.println("Please choose between + - * and /: ");
		String op=s.nextLine();
		System.out.println("Enter the first number: ");
		int num1=s.nextInt();
		System.out.println("Enter the second number: ");
		int num2=s.nextInt();
            switch (op) {
                case "+":
                    result = cal.addition(num1, num2);
                    System.out.println("Result= "+ result);
                    break;
                case "-":
                    result = cal.subtraction(num1, num2);
                    System.out.println("Result= "+ result);
                    break;
                case "*":
                    result = cal.multiplication(num1, num2);
                    System.out.println("Result= "+ result);
                    break;
                case "/":
                    result = cal.division(num1, num2);
                    System.out.println("Result= "+ result);
                    break;
                default:
                    System.out.println("There is NO such operation! Please choose between the 4!");
                    break;
            }
	}
	}


