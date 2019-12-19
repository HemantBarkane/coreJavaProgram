package com.example.coreJava;

public class StringSortingBubble {

	public static void main(String[] args) {
		String s[] = {"hemant","ram","bali","zack","herolad"};
		String temp;
		System.out.println("string in sorted order : ");
		for(int j=0;j<s.length;j++){
			for(int i=j+1;i<s.length;i++){
				if (s[i].compareTo(s[j])<0) {
					temp = s[j];
					s[j] = s[i];
					s[i] = temp;
					
				}
				
			}
			System.out.println(s[j]);
		}
	}

}
