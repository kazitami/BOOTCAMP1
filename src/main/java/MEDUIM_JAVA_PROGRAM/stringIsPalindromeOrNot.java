package MEDUIM_JAVA_PROGRAM;

import java.util.Scanner;

public class stringIsPalindromeOrNot {
	public static void main(String[] args) {
		Scanner scanString = new Scanner(System.in);
		System.out.println("Please enter string");
		String originalString = scanString.nextLine().toLowerCase();
	
		String reverseString = "";
		
		for(int i=originalString.length()-1;i>=0; i--)
		{
			reverseString += originalString.charAt(i);
		}
		
		boolean palindrome = true;
		for(int i=0;i<originalString.length();i++) 
		{
			if(originalString.charAt(i)!= reverseString.charAt(i)) {
				palindrome = false;
			}
		}
		
		if(palindrome) {
			System.out.println("String is Palindrome");
		}else
		{
			System.out.println("String is not Palindrome");
		}
	}
}