package org.apex.java_assignment;

public class BasicCalculator {
int num1;
int num2;
public int addition(int result) {
	return result=num1+num2;
}
public int subtraction(int result) {
	if(num1>num2) {
		 return result=num1-num2;
	}
		else {
			return result=num2-num1;}
}

public int multiplication(int result) {
	return num1*num2;
}
public int division(int result) {
	if(num1>num2) {
		 return result=num1/num2;
	}
		else {
			return result=num2/num1;}
}
}
