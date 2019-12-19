package com.example.coreJava;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		int count;
		Random random = new Random();
		for(count=1;count<=5;count++){
			System.out.println(random.nextInt(200));
		}
	}

}
