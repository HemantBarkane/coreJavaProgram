package com.example.coreJava;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int i=0,j=0,temp,count;
		Scanner sc = new Scanner(System.in);
		System.out.println("how many element you want to enter :");
		count = sc.nextInt();
		int n[] = new int[count];
		for(i=0;i<count;i++){
			System.out.println("enter element :");
			n[i] = sc.nextInt();
		}
		
		j = i-1;
		i=0;
		while(i<j){
			temp = n[i];
			n[i] = n[j];
			n[j] = temp;
			i++;j--;	
		}
		System.out.println("reversed array :");
		for(i=0;i<count;i++){
			System.out.println(n[i]);
		}
	}

}
