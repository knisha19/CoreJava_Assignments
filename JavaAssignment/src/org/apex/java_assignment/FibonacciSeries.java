package org.apex.java_assignment;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n=0,n1=1,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the count for Fibonacci Series");
		int count=s.nextInt();
		System.out.println("Fibonacci Series upto"+""+count+" : ");
		for(int i=1;i<=count;i++) {
			System.out.println(n);
		    sum = n + n1;
            n = n1;
            n1 = sum;
		}
	}

}
