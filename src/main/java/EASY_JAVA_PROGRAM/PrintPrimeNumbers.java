package EASY_JAVA_PROGRAM;

import java.util.Scanner;

public class PrintPrimeNumbers {
	
	public static void main(String[] args) {
		int number;
		System.err.println("Please enter number : ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		boolean isPrime = true;
		if(number==0 || number==1) {
			System.err.println(number + " is not a prime number");
		}else
		{
			for(int i=2;i<=number / 2; i++) {
				if(number % i == 0) {
					isPrime=false;
				}
			}
		}
		if(isPrime) {
			System.out.println(number + " is Prime number");
		}
		else
		{
			System.out.println(number + " is not Prime number");
		}
	}
}	

