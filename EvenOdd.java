package com.example.coreJava;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of n :");
		n = sc.nextInt();
		if(n%2==0){
			System.out.println("given number is even :"+ n);	
		}
		else {
			System.out.println("given number is odd :"+ n);
		}

	}

}
