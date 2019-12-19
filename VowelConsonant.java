package com.example.coreJava;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		char c ;
		Scanner sc = new Scanner(System.in);
		boolean isVowel = false;
		System.out.println("enter character:");
		c = sc.next().charAt(0);
		switch (c) {
		case 'a' :	
		case 'e' :	
		case 'i' :
		case 'o' :
		case 'u' :
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' : isVowel =  true;
			}
		if(isVowel==true){
			System.out.println(c +": is vowel");
		}
		else{
			if((c>='a'&&c<='z') || (c>='A'&&c<='Z')){
				System.out.println(c +": is consonant");	
			}else
			{
				System.out.println(c +": is not a alphabet");
			}
		}
			

	}

}
