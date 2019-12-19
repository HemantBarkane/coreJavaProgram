package com.example.coreJava;

import java.util.Scanner;

public class BreakNumberIntoDigit {

	public static void main(String[] args) {
		 int num,temp,digit,count=0;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter any number : ");
		 num = sc.nextInt();
		 temp = num;
		 while(num>0){
			 num = num/10;
			 count++;
		 }
		 while(temp>0){
			 digit = temp%10;
			 System.out.println("digit at place :"+count+"is :"+digit);
			 temp = temp/10;
			 count--; 
		 }
	}

}
