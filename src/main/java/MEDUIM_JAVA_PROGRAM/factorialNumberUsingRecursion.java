package MEDUIM_JAVA_PROGRAM;

import java.util.Scanner;

public class factorialNumberUsingRecursion {

	public static void main(String[] args) {
		int number;
		System.out.print("Please enter number : ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		int factorialResult = factorial(number);
		System.out.println("Factorial number is -> " + number);
		System.out.println("Factorial Result is -> " + factorialResult);
		
	}
	
	static int factorial(int n) {
		if(n==1) 
			return 1;
	
		return n* factorial(n-1);
		
	}

}