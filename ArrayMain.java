package com.example.coreJava;

public class ArrayMain {
	static void min(int a[]){
		int min = a[0];
		for(int i=0;i<a.length;i++)
		if( min>a[i])
			min=a[i];
		System.out.println(min);
	}
	public static void main(String args[]){
		int a[]={33,3,4,5};
		min(a);
	}

}
