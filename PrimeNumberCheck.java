package com.example.coreJava;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		int num,temp;
		boolean isPrime = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		num = sc.nextInt();
		for(int i=2;i<=num/2;i++){
			temp = num%i;
				if(temp==0){
					isPrime = false;
				}
		}
		if(isPrime){
			System.out.println(num +"is prime");	
		}else
		System.out.println(num +": is not prime");
	}

}
