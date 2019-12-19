package com.example.coreJava;

public class AverageArray {

	public static void main(String[] args) {
		int a[] = {7,71,30,65,15,20,10};
		double total=0, avg;
		for(int i=0;i<a.length;i++){
			total = total+a[i];			
		}
		avg = total/a.length;
		System.out.println(avg);
	}

}
