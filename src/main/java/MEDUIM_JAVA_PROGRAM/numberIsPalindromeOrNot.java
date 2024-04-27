package MEDUIM_JAVA_PROGRAM;

import java.util.Scanner;

public class numberIsPalindromeOrNot {
	public static void main(String[] args) {
		int originalNumber;
		System.out.println("Please Enter The Number");
		Scanner num = new Scanner(System.in);
		originalNumber = num.nextInt();		
		
		int reversedNumber=0; int temp = originalNumber;
		
		while(temp>0)
		{
			int remainder =temp%10;
			reversedNumber = reversedNumber * 10 + remainder;
			temp = temp/10;
		}
		if(originalNumber == reversedNumber)
		{
			System.err.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
	}
}
