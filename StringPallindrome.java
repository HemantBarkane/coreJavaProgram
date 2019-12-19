package com.example.coreJava;

import java.util.Scanner;
import java.util.Stack;

public class StringPallindrome {

	public static void main(String[] args) {
		String inputString, reverseString ="";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string :");
		inputString = sc.nextLine();
		Stack stack = new Stack();
		for(int i=0;i<inputString.length();i++){
			stack.push(inputString.charAt(i));	
		}
		while(!stack.isEmpty()){
			reverseString = reverseString + stack.pop();
		}
		if (inputString.equals(reverseString)) {
			System.out.println("pallindrome");
			
		} else {
			System.out.println("is not pallindrome");

		}
	}

}
