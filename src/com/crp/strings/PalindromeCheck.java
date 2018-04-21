package com.crp.strings;

import java.util.Scanner;

/**
 * @author Rajendra
 *
 */


public class PalindromeCheck {
	@SuppressWarnings("resource")
	//main menthod including all business login
	public static void main(String args[]) {
		String str, rev = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string to check :");
		str = sc.nextLine();

		int length = str.length();

		for (int i = length - 1; i >= 0; i--)
			rev = rev + str.charAt(i);

		if (str.equals(rev))
			System.out.println(str + " : is a palindrome");
		else
			System.out.println(str + " : is not a palindrome");

	}

}
