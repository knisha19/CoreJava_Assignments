package org.apex.java_assignment;

import java.util.Scanner;

public class CheckString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer : ");
		String n = scanner.next();
		boolean isInteger = isInteger(n);
		if (isInteger) {
			System.out.println(n + " is an integer");
		} else {
			System.out.println(n + " is not an integer");
		}
		System.out.print("Enter an integer to check for odd number: ");
		String num = scanner.next();
		if (isOddNumber(num)) {
			System.out.println(num + " is a odd number");
		} else {
			System.out.println(num + " is not a odd number");
		}
		System.out.print("Enter an integer to check for even number : ");
		String num1 = scanner.next();
		if (isEvenNumber(num1)) {
			System.out.println(num1 + " is a even number");
		} else {
			System.out.println(num1 + " is not a even number");
		}
		System.out.print("Enter an integer to check for prime number : ");
		String num2 = scanner.next();
		if (isPrimeNumber(num2)) {
			System.out.println(num2 + " is a prime number");
		} else {
			System.out.println(num2 + " is not a prime number");
		}
	}

	public static boolean isInteger(String str) {
		boolean isInteger = true;
		int size = str.length();
		for (int i = 0; (i < size) && isInteger; i++) {
			isInteger = Character.isDigit(str.charAt(i));
		}
		return isInteger;
	}

	public static boolean isOddNumber(String str) {
		boolean isOddNumber = true;
		int n = Integer.parseInt(str);
		if (n % 2 != 0) {
			return isOddNumber;
		}
		return false;
	}

	public static boolean isEvenNumber(String str) {
		boolean isEvenNumber = true;
		int n = Integer.parseInt(str);
		if (n % 2 == 0) {
			return isEvenNumber;
		}
		return false;
	}

	public static boolean isPrimeNumber(String str) {
		boolean isPrimeNumber = true;
		int n = Integer.parseInt(str);
		if (n <= 1)
			return false;
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;
		return isPrimeNumber;
	}
}
