package com.example.coreJava;

import java.util.Scanner;

public class NumberIsPositiveOrNegative {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number to check :");
		num = sc.nextInt();
		if(num>0){
			System.out.println("positive");
		}else if(num<0){
			System.out.println("negative");
		}else
			System.out.println("nor positive or negative");
	}

}
