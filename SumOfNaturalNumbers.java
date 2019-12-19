package com.example.coreJava;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		int num,count,total=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number ....:");
		num = sc.nextInt();
		for(count=1;count<=num;count++)
		{
			total = total+count;
		}
		System.out.println(total);
	}

}
