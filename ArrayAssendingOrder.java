package com.example.coreJava;

import java.util.Scanner;

public class ArrayAssendingOrder {

	public static void main(String[] args) {
		int count, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter element :");
		count = sc.nextInt();
		int n[] = new int[count];
		for(int i=0;i<count;i++){
			n[i] = sc.nextInt();
		}
		for(int i=0;i<count;i++){
			for(int j=i+1;j<count;j++){
				if(n[i]>n[j]){
					temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				}
			}
		}
		System.out.println("assending order : ");
		for(int i = 0;i<count-1;i++){
			System.out.print(n[i]+",");
		}
		System.out.println(n[count - 1]);
	}

}
