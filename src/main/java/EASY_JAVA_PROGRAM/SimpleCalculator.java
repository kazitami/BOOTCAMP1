package EASY_JAVA_PROGRAM;

import java.util.Scanner;

public class SimpleCalculator {

	//Addition, Subtraction, Multiplication, Division
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int number1 = scan.nextInt();
				
		System.out.println("Enter the second number");
		int number2 = scan.nextInt();
		
		System.out.println("Choose the mathematical operation ( +, -, *, /)");
		String mathOperator = scan.next();
		
		int result;
		
		switch(mathOperator) {
		
		case "+" : result = number1 + number2;
		System.out.println("The sum of two numbers is : " + result);
		break;
		
		case "-" : result = number1 - number2;
		System.out.println("The difference of two numbers is : " + result);
		break;
		
		case "*" : result = number1 * number2;
		System.out.println("The multiplication of two numbers is : " + result);
		break;
		
		case "/" : result = number1/number2;
		System.out.println("The division of two numbers is : " + result);
		break;
		
		default: System.out.println("invalid mathOperator");
		break;
		}

	}

}