package com.rajjava.strings;


/**
 * @author Raj Java Academy 
 *
 */


public class Palindrome{
	
	public static void main(String args[]) {
		
		palindormeCheck("aba");
		
		
	}
	
	static void palindormeCheck(String str) {
		String temp="";
		
		for(int i=str.length()-1; i>=0 ;i--) {
			temp = temp+str.charAt(i);
					}
		
		if(temp.equals(str))
			System.out.println("the entered string"+str +" is Palindorme");
		else
			System.out.println("the entered string"+str +" is NOT a Palindorme");
		
	}
}
